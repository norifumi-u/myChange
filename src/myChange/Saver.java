package myChange;

import static myChange.MyChange.MyChange.*;

import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.SocketChannelEndpoint;
import org.scribble.runtime.session.MPSTEndpoint;

import myChange.MyChange.MyChange;
import myChange.MyChange.roles.S;
import myChange.MyChange.statechans.S.MyChange_S_1;

public class Saver {
    public static void main(String[] args) throws Exception {

		int t = 0;

		try (MPSTEndpoint<MyChange, S> saver = new MPSTEndpoint<>(new MyChange(), S, new ObjectStreamFormatter())) {
		    saver.request(D2, SocketChannelEndpoint::new, "localhost", 7777);

		    MyChange_S_1 s1 = new MyChange_S_1(saver);

			while(t < 10000) {
			    if(t%1000 == 0){
			    	s1 = s1.send(D2, save2);
			    }
			    t++;
			}
			s1.send(D2, exit);
		}
    }
}
