package myChange.MyChange.statechans.D1;

import java.io.IOException;
import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.statechans.D1.ioifaces.*;

public final class MyChange_D1_1 extends org.scribble.runtime.statechans.BranchSocket<MyChange, D1> implements Branch_D1_C_change__C_exit__C_save<MyChange_D1_1, EndSocket, MyChange_D1_1> {
	public static final MyChange_D1_1 cast = null;

	protected MyChange_D1_1(org.scribble.runtime.session.SessionEndpoint<MyChange, D1> se, boolean dummy) {
		super(se);
	}

	public MyChange_D1_1(org.scribble.runtime.session.MPSTEndpoint<MyChange, D1> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public MyChange_D1_1_Cases branch(C role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyChange.C);
		Branch_D1_C_change__C_exit__C_save_Enum openum;
		if (m.op.equals(MyChange.change)) {
			openum = Branch_D1_C_change__C_exit__C_save_Enum.change;
		}
		else if (m.op.equals(MyChange.save)) {
			openum = Branch_D1_C_change__C_exit__C_save_Enum.save;
		}
		else if (m.op.equals(MyChange.exit)) {
			openum = Branch_D1_C_change__C_exit__C_save_Enum.exit;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new MyChange_D1_1_Cases(this.se, true, openum, m);
	}

	public void branch(C role, MyChange_D1_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_D1_C_change__C_exit__C_save<MyChange_D1_1, EndSocket, MyChange_D1_1>) handler);
	}

	@Override
	public void branch(C role, Handle_D1_C_change__C_exit__C_save<MyChange_D1_1, EndSocket, MyChange_D1_1> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyChange.C);
		if (m.op.equals(MyChange.change)) {
			handler.receive(new MyChange_D1_1(this.se, true), MyChange.change);
		}
		else
		if (m.op.equals(MyChange.save)) {
			handler.receive(new MyChange_D1_1(this.se, true), MyChange.save);
		}
		else
		if (m.op.equals(MyChange.exit)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), MyChange.exit);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(C role, Handle_D1_C_change__C_exit__C_save<Succ_In_C_change, Succ_In_C_exit, Succ_In_C_save> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyChange.C);
		if (m.op.equals(MyChange.change)) {
			handler.receive(new MyChange_D1_1(this.se, true), MyChange.change);
		}
		else
		if (m.op.equals(MyChange.save)) {
			handler.receive(new MyChange_D1_1(this.se, true), MyChange.save);
		}
		else
		if (m.op.equals(MyChange.exit)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), MyChange.exit);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}