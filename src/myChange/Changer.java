package myChange;

import static myChange.MyChange.MyChange.*;

import java.util.Date;

import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.SocketChannelEndpoint;
import org.scribble.runtime.session.MPSTEndpoint;

import myChange.MyChange.MyChange;
import myChange.MyChange.roles.C;
import myChange.MyChange.statechans.C.MyChange_C_1;

public class Changer {

	public static void main(String[] args) throws Exception {
		run();
	}

    public static void run() throws Exception {

    	try (MPSTEndpoint<MyChange, C> changer = new MPSTEndpoint<>(new MyChange(), C, new ObjectStreamFormatter())) {
		    changer.request(D1, SocketChannelEndpoint::new, "localhost", 8888);

			MyChange_C_1 c1 = new MyChange_C_1(changer);

			long start = new Date().getTime();
			long now = 0;
			long lastChanged = 0;
			long lastSaved = 0;

			while(now - start < 5000) {
			    if (now - lastChanged > 700) {
			    	c1 = c1.send(D1, change);
			    	System.out.println("Changer: change sent");
			    	lastChanged = now;
			    }
			    if (now - lastSaved > 1500) {
			    	c1 = c1.send(D1, save);
			    	System.out.println("Changer: save sent");
			    	lastSaved = now;
			    }
			    Thread.sleep(50);
			    now = new Date().getTime();
			}
			c1.send(D1, save).send(D1, exit);
			System.out.println("Changer: exit sent");
		}
    }
}
