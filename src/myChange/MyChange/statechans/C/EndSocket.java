package myChange.MyChange.statechans.C;

import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.statechans.C.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<MyChange, C> implements Succ_Out_D1_exit {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<MyChange, C> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}