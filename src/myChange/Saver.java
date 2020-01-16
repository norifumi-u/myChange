package myChange;

import static myChange.MyChange.MyChange.*;

import java.io.IOException;

import org.scribble.main.ScribRuntimeException;
import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.SocketChannelEndpoint;
import org.scribble.runtime.session.MPSTEndpoint;

import myChange.MyChange.MyChange;
import myChange.MyChange.roles.S;
import myChange.MyChange.statechans.S.MyChange_S_1;

public class Saver {

	public static void main(String[] args) throws Exception {
		run();
	}

    public static void run() throws Exception {

		int t = 0;

		try (MPSTEndpoint<MyChange, S> saver = new MPSTEndpoint<>(new MyChange(), S, new ObjectStreamFormatter())) {
		    saver.request(D2, SocketChannelEndpoint::new, "localhost", 7777);

		    MyChange_S_1 s1 = new MyChange_S_1(saver);

		    while(t < 50000) {
			    if(t%5000 == 0){
			    	s1 = s1.send(D2, save2);
			    	System.out.println("Saver: save2 sent");
			    }
			    t++;
			}
			//s1.send(D2, exit);
		} catch (ScribRuntimeException | IOException e) {
			e.printStackTrace();
		}
    }

//	public static void run() throws Exception {
//
//		try (MPSTEndpoint<MyChange, S> saver = new MPSTEndpoint<>(new MyChange(), S, new ObjectStreamFormatter())) {
//		    saver.request(D2, SocketChannelEndpoint::new, "localhost", 7777);
//
//		    MyChange_S_1 s1 = new MyChange_S_1(saver);
//
//		    while(Data.t < 50000) {
//			    if(Data.t % 5000 == 0){
//			    	System.out.println("Saver: t = " + Data.t);
//			    	s1 = s1.send(D2, save2);
//			    	System.out.println("Saver: save2 sent");
//			    }
//		    }
//			//s1.send(D2, exit);
//		} catch (ScribRuntimeException | IOException e) {
//			e.printStackTrace();
//		}
//	}
}
