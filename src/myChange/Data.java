package myChange;

import static myChange.MyChange.MyChange.*;

import java.io.IOException;

import org.scribble.main.ScribRuntimeException;
import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.ScribServerSocket;
import org.scribble.runtime.net.SocketChannelServer;
import org.scribble.runtime.session.MPSTEndpoint;
import org.scribble.runtime.util.Buf;

import myChange.MyChange.MyChange;
import myChange.MyChange.roles.D1;
import myChange.MyChange.roles.D2;
import myChange.MyChange.statechans.D1.MyChange_D1_1;
import myChange.MyChange.statechans.D1.MyChange_D1_1_Cases;
import myChange.MyChange.statechans.D2.MyChange_D2_1;
import myChange.MyChange.statechans.D2.MyChange_D2_1_Future;

public class Data {
	static int t=0;

	public Data(int t) {
		Data.t += t;
	}

    public static void main(String[] args) throws Exception {

    	int n = 1, a = 0;

    	boolean flag = false;

		try (ScribServerSocket s1 = new SocketChannelServer(8888); ScribServerSocket s2 = new SocketChannelServer(7777)) {
				try (MPSTEndpoint<MyChange, D1> data1 = new MPSTEndpoint<>(new MyChange(), D1, new ObjectStreamFormatter());
				     MPSTEndpoint<MyChange, D2> data2 = new MPSTEndpoint<>(new MyChange(), D2, new ObjectStreamFormatter())) {

				    data1.accept(s1, C);
				    data2.accept(s2, S);

				    MyChange_D1_1 d1 = new MyChange_D1_1(data1);
				    MyChange_D2_1 d2 = new MyChange_D2_1(data2);

			    	var buf = new Buf<MyChange_D2_1_Future>();
				    d2 = d2.async(S, save2, buf);

				    exit:
				    while(true) {
				    	int b = a+1;

				    	System.out.println("D2: step");
				    	new Thread(new Runnable() {public void run() {
				    		try {
				    			buf.val.sync();
				    		} catch(IOException e) {
				    			e.printStackTrace();
				    		}
				    	}}).start();
				    	if(buf.val.isDone()) {
				    		System.out.println("D2: save2 received");
				    		if(flag) {
				    			System.out.println(n + "回目　保存しました。");
				    			n++;
				    			flag = false;
				    		}
				    		else System.out.println("D2: 何もしない。");
				    		d2 = d2.async(S, save2, buf);
				    	}

					    buf.val.sync();
					    System.out.println("--------------");

					    MyChange_D1_1_Cases case1 = d1.branch(C);
					    switch(case1.op) {
					    case change:
					    	d1 = case1.receive(C, change);
					    	System.out.println("D1: change received");
					    	System.out.println(a + " ⇨ " + b);
					    	a++;
					    	if(!flag) flag = true;
					    	break;
					    case save1:
					    	d1 = case1.receive(C, save1);
					    	System.out.println("D1: save1 received");
					    	if(flag) {
					    		//doSave();
					    		System.out.println(n + "回目  保存しました。");
					    		n++;
					    		flag = false;
					    	}
					    	else System.out.println("D1: 何もしない。");
					    	break;
					    case exit:
					    	case1.receive(C, exit);
					    	System.out.println("D1: exit received");
					    	System.out.println("終了しました。");
					    	break exit;
					    }
					    t++;
					    //System.out.println("Data: t = "+t);
				    }
				}
		} catch (ScribRuntimeException | IOException | ClassNotFoundException e) {
		    e.printStackTrace();
		}
    }
}
