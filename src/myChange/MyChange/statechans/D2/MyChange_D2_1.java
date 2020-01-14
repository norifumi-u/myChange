package myChange.MyChange.statechans.D2;

import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;
import myChange.MyChange.statechans.D2.ioifaces.*;

public final class MyChange_D2_1 extends org.scribble.runtime.statechans.ReceiveSocket<MyChange, D2> implements Receive_D2_S_save2<MyChange_D2_1> {
	public static final MyChange_D2_1 cast = null;

	protected MyChange_D2_1(org.scribble.runtime.session.SessionEndpoint<MyChange, D2> se, boolean dummy) {
		super(se);
	}

	public MyChange_D2_1(org.scribble.runtime.session.MPSTEndpoint<MyChange, D2> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public MyChange_D2_1 receive(S role, save2 op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.readScribMessage(MyChange.S);
		return new MyChange_D2_1(this.se, true);
	}

	public MyChange_D2_1 async(S role, save2 op, org.scribble.runtime.util.Buf<MyChange_D2_1_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new MyChange_D2_1_Future(super.getFuture(MyChange.S));
		return new MyChange_D2_1(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(MyChange.S);
	}

	@SuppressWarnings("unchecked")
	public MyChange_D2_1 async(S role, save2 op) throws org.scribble.main.ScribRuntimeException {
		return async(MyChange.S, op, (org.scribble.runtime.util.Buf<MyChange_D2_1_Future>) this.se.gc);
	}
}