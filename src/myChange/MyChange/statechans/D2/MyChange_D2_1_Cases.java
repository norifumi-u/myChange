package myChange.MyChange.statechans.D2;

import myChange.MyChange.MyChange;
import myChange.MyChange.ops.exit;
import myChange.MyChange.ops.save2;
import myChange.MyChange.roles.D2;
import myChange.MyChange.roles.S;
import myChange.MyChange.statechans.D2.ioifaces.Branch_D2_S_exit__S_save2;
import myChange.MyChange.statechans.D2.ioifaces.Case_D2_S_exit__S_save2;

public final class MyChange_D2_1_Cases extends org.scribble.runtime.statechans.CaseSocket<MyChange, D2> implements Case_D2_S_exit__S_save2<EndSocket, MyChange_D2_1> {
	public static final MyChange_D2_1_Cases cast = null;
	public final MyChange_D2_1.Branch_D2_S_exit__S_save2_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected MyChange_D2_1_Cases(org.scribble.runtime.session.SessionEndpoint<MyChange, D2> se, boolean dummy, MyChange_D2_1.Branch_D2_S_exit__S_save2_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public MyChange_D2_1 receive(S role, save2 op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyChange.save2)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new MyChange_D2_1(this.se, true);
	}

	public MyChange_D2_1 receive(save2 op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyChange.S, op);
	}

	public myChange.MyChange.statechans.D2.EndSocket receive(S role, exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyChange.exit)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public myChange.MyChange.statechans.D2.EndSocket receive(exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyChange.S, op);
	}

	@Override
	public Branch_D2_S_exit__S_save2.Branch_D2_S_exit__S_save2_Enum getOp() {
		return this.op;
	}
}