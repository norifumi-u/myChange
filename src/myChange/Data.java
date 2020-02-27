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
    private static boolean flag = false;

    public static void main(String[] args) throws Exception {
    	try (ScribServerSocket s1 = new SocketChannelServer(8888);
    		 ScribServerSocket s2 = new SocketChannelServer(7777)) {
    		run(s1, s2);
    	}
    }

    public static void run(ScribServerSocket s1, ScribServerSocket s2) throws Exception {

    	new Thread(new Runnable() {public void run() {
		    try (MPSTEndpoint<MyChange, D2> data2 = new MPSTEndpoint<>(new MyChange(), D2, new ObjectStreamFormatter())) {
				data2.accept(s2, S);

				MyChange_D2_1 d2 = new MyChange_D2_1(data2);

				var buf = new Buf<MyChange_D2_1_Future>();
				d2 = d2.async(S, save, buf);

				while(true) {
					runAsync(() -> buf.val.sync());
				    System.out.println("D2: step");
				    if(buf.val.isDone()) {
				    	System.out.println("D2: save received");
				    	if(flag) {
				    		System.out.println("保存しました。");
				    		flag = false;
				    	}
				    	else System.out.println("D2: 何もしない。");
					d2 = d2.async(S, save, buf);
				    }
				    buf.val.sync();
				}
		    } catch (ScribRuntimeException | IOException e) {
		    	e.printStackTrace();
		    }
    	}}).start();

		try (MPSTEndpoint<MyChange, D1> data1 =
			 new MPSTEndpoint<>(new MyChange(), D1, new ObjectStreamFormatter())) {

		    int a=0;
		    data1.accept(s1, C);

		    MyChange_D1_1 d1 = new MyChange_D1_1(data1);

		    exit:
		    while(true) {
		    	int b = a+1;
				MyChange_D1_1_Cases case1 = d1.branch(C);
				switch(case1.op) {
				case change:
				    d1 = case1.receive(C, change);
				    System.out.println("D1: change received");
				    System.out.println("データの書き換え " + a + " ⇨ " + b);
				    a++;
				    if(!flag) flag = true;
				    break;
				case save:
				    d1 = case1.receive(C, save);
				    System.out.println("D1: save received");
				    if(flag) {
					System.out.println("保存しました。");
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
		    }


		} catch (ScribRuntimeException | IOException e) {
		    e.printStackTrace();
		}
    }
	public static interface RunnableWithIOException {
		public void run() throws IOException;
	}

	public static void runAsync(RunnableWithIOException r) {
		new Thread(() -> {
			try {
				r.run();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}).start();
	}
}
