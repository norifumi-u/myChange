package myChange.MyChange.statechans.D2;

import myChange.MyChange.MyChange;
import myChange.MyChange.roles.D2;
import myChange.MyChange.statechans.D2.ioifaces.Succ_In_S_exit;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<MyChange, D2> implements Succ_In_S_exit {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<MyChange, D2> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}