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

    	int t = 0;

    	try (MPSTEndpoint<MyChange, C> changer = new MPSTEndpoint<>(new MyChange(), C, new ObjectStreamFormatter())) {
		    changer.request(D1, SocketChannelEndpoint::new, "localhost", 8888);

			MyChange_C_1 c1 = new MyChange_C_1(changer);

			while (t < 10000) {
			    if (t%30 == 0) {
			    	c1 = c1.send(D1, change);
			    } else if (t%100 == 0) {
			    	c1 = c1.send(D1, save1);
			    }
			    t++;
			}
			c1.send(D1, exit);
		}
    }
}
