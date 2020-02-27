package myChange.MyChange.statechans.C;

import java.io.IOException;
import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;
import myChange.MyChange.statechans.C.ioifaces.*;

public final class MyChange_C_1 extends org.scribble.runtime.statechans.OutputSocket<MyChange, C> implements Select_C_D1_change__D1_exit__D1_save<MyChange_C_1, EndSocket, MyChange_C_1> {
	public static final MyChange_C_1 cast = null;

	protected MyChange_C_1(org.scribble.runtime.session.SessionEndpoint<MyChange, C> se, boolean dummy) {
		super(se);
	}

	public MyChange_C_1(org.scribble.runtime.session.MPSTEndpoint<MyChange, C> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public MyChange_C_1 send(D1 role, change op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyChange.change);

		return new MyChange_C_1(this.se, true);
	}

	public MyChange_C_1 send(D1 role, save op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyChange.save);

		return new MyChange_C_1(this.se, true);
	}

	public myChange.MyChange.statechans.C.EndSocket send(D1 role, exit op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyChange.exit);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}