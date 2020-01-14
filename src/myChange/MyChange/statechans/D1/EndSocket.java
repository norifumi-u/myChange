package myChange.MyChange.statechans.D1;

import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.statechans.D1.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<MyChange, D1> implements Succ_In_C_exit {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<MyChange, D1> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}