package myChange;

import static myChange.MyChange.MyChange.*;

import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.SocketChannelEndpoint;
import org.scribble.runtime.session.MPSTEndpoint;

import myChange.MyChange.MyChange;
import myChange.MyChange.roles.C;
import myChange.MyChange.statechans.C.MyChange_C_1;

public class Changer {

	public static void main(String[] args) throws Exception {
		//Data.t=0;
		run();
	}

    public static void run() throws Exception {

    	int t = 0;

    	try (MPSTEndpoint<MyChange, C> changer = new MPSTEndpoint<>(new MyChange(), C, new ObjectStreamFormatter())) {
		    changer.request(D1, SocketChannelEndpoint::new, "localhost", 8888);

			MyChange_C_1 c1 = new MyChange_C_1(changer);

			while(t < 50000) {
			    if (t%300 == 0) {
			    	c1 = c1.send(D1, change);
			    	System.out.println("Changer: change sent");
			    }
			    if (t%1500 == 0) {
			    	c1 = c1.send(D1, save1);
			    	System.out.println("Changer: save1 sent");
			    }
			    t++;
			}
			c1.send(D1, exit);
			System.out.println("Changer: exit sent");
		}
    }

//	public static void run() throws Exception {
//
//    	try (MPSTEndpoint<MyChange, C> changer = new MPSTEndpoint<>(new MyChange(), C, new ObjectStreamFormatter())) {
//		    changer.request(D1, SocketChannelEndpoint::new, "localhost", 8888);
//
//			MyChange_C_1 c1 = new MyChange_C_1(changer);
//
//			while(Data.t < 50000) {
//				System.out.println("Changer: t = "+Data.t);
//			    if (Data.t % 300 == 0) {
//			    	c1 = c1.send(D1, change);
//			    	System.out.println("Changer: change sent");
//			    }
//			    if (Data.t % 1500 == 0) {
//			    	c1 = c1.send(D1, save1);
//			    	System.out.println("Changer: save1 sent");
//			    }
//
//			}
//			c1.send(D1, exit);
//			System.out.println("Changer: exit sent");
//		}
//    }
}
