package myChange.MyChange.statechans.S;

import java.io.IOException;
import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;
import myChange.MyChange.statechans.S.ioifaces.*;

public final class MyChange_S_1 extends org.scribble.runtime.statechans.OutputSocket<MyChange, S> implements Select_S_D2_save<MyChange_S_1> {
	public static final MyChange_S_1 cast = null;

	protected MyChange_S_1(org.scribble.runtime.session.SessionEndpoint<MyChange, S> se, boolean dummy) {
		super(se);
	}

	public MyChange_S_1(org.scribble.runtime.session.MPSTEndpoint<MyChange, S> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public MyChange_S_1 send(D2 role, save op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyChange.save);

		return new MyChange_S_1(this.se, true);
	}
}