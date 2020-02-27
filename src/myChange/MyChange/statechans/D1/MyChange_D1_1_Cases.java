package myChange.MyChange.statechans.D1;

import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;
import myChange.MyChange.statechans.D1.ioifaces.*;

public final class MyChange_D1_1_Cases extends org.scribble.runtime.statechans.CaseSocket<MyChange, D1> implements Case_D1_C_change__C_exit__C_save<MyChange_D1_1, EndSocket, MyChange_D1_1> {
	public static final MyChange_D1_1_Cases cast = null;
	public final MyChange_D1_1.Branch_D1_C_change__C_exit__C_save_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected MyChange_D1_1_Cases(org.scribble.runtime.session.SessionEndpoint<MyChange, D1> se, boolean dummy, MyChange_D1_1.Branch_D1_C_change__C_exit__C_save_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public MyChange_D1_1 receive(C role, change op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyChange.change)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new MyChange_D1_1(this.se, true);
	}

	public MyChange_D1_1 receive(change op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyChange.C, op);
	}

	public MyChange_D1_1 receive(C role, save op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyChange.save)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new MyChange_D1_1(this.se, true);
	}

	public MyChange_D1_1 receive(save op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyChange.C, op);
	}

	public myChange.MyChange.statechans.D1.EndSocket receive(C role, exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyChange.exit)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public myChange.MyChange.statechans.D1.EndSocket receive(exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyChange.C, op);
	}

	@Override
	public Branch_D1_C_change__C_exit__C_save.Branch_D1_C_change__C_exit__C_save_Enum getOp() {
		return this.op;
	}
}