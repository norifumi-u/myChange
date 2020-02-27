package myChange;

import static myChange.MyChange.MyChange.*;

import java.io.IOException;
import java.util.Date;

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

		MPSTEndpoint<MyChange, S> saver = new MPSTEndpoint<>(new MyChange(), S, new ObjectStreamFormatter());
		try {
		    saver.request(D2, SocketChannelEndpoint::new, "localhost", 7777);

		    MyChange_S_1 s1 = new MyChange_S_1(saver);

		    long start = new Date().getTime();
		    long now = 0;
		    long lastSaved = 0;
		    while(now - start < 5000) {
			    if(now - lastSaved > 1000){
			    	s1 = s1.send(D2, save);
			    	System.out.println("Saver: save sent");
			    	lastSaved = now;
			    }
			    now = new Date().getTime();
			}
		} catch (ScribRuntimeException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("Saver: finished");
    }
}
