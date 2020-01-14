package myChange.MyChange.statechans.S;

import myChange.MyChange.MyChange;
import myChange.MyChange.roles.S;
import myChange.MyChange.statechans.S.ioifaces.Succ_Out_D2_exit;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<MyChange, S> implements Succ_Out_D2_exit {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<MyChange, S> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}