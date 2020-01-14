package myChange;

import static myChange.MyChange.MyChange.*;

import java.io.IOException;

import org.scribble.main.ScribRuntimeException;
import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.ScribServerSocket;
import org.scribble.runtime.net.SocketChannelServer;
import org.scribble.runtime.session.MPSTEndpoint;

import myChange.MyChange.MyChange;
import myChange.MyChange.roles.D1;
import myChange.MyChange.roles.D2;
import myChange.MyChange.statechans.D1.MyChange_D1_1;
import myChange.MyChange.statechans.D1.MyChange_D1_1_Cases;
import myChange.MyChange.statechans.D2.MyChange_D2_1;
import myChange.MyChange.statechans.D2.MyChange_D2_1_Cases;

public class Data {

    public static void main(String[] args) throws Exception {

    	int n = 1;
    	int a = 0, b = a+1;
    	boolean flag = false;

		try (ScribServerSocket s1 = new SocketChannelServer(8888); ScribServerSocket s2 = new SocketChannelServer(7777)) {
		    while(true) {
				try (MPSTEndpoint<MyChange, D1> data1 = new MPSTEndpoint<>(new MyChange(), D1, new ObjectStreamFormatter());
				     MPSTEndpoint<MyChange, D2> data2 = new MPSTEndpoint<>(new MyChange(), D2, new ObjectStreamFormatter())) {

				    data1.accept(s1, C);
				    data2.accept(s2, S);

				    MyChange_D1_1 d1 = new MyChange_D1_1(data1);
				    MyChange_D2_1 d2 = new MyChange_D2_1(data2);

				    MyChange_D1_1_Cases case1 = d1.branch(C);
				    switch(case1.op) {
				    case change:
				    	case1.receive(C, change);
				    	System.out.println(a + " ⇨ " + b);
				    	a++;
				    	flag = true;
				    	break;
				    case save1:
				    	case1.receive(C, save1);
				    	if(flag) {
				    		//doSave();
				    		n++;
				    		System.out.println(n + "回目  保存しました。");
				    		flag = false;
				    	}
				    	else break;
				    case exit:
				    	case1.receive(C, exit);
				    	System.out.println("終了しました。");
				    	break;
				    }


				    MyChange_D2_1_Cases case2 = d2.branch(S);
				    switch(case2.op) {
				    case save2:
				    	case2.receive(S, save2);
				    	if (flag) {
				    		//doSave();
				    		n++;
				    		System.out.println(n + "回目　保存しました。");
				    		flag = false;
				    	} else break;
				    case exit:
				    	case2.receive(S, exit);
				    	System.out.println("終了しました。");
				    	break;
				    }

				}
		    }
		} catch (ScribRuntimeException | IOException | ClassNotFoundException e) {
		    e.printStackTrace();
		}
    }
}
