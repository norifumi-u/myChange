package myChange.MyChange.statechans.D1.ioifaces;

import myChange.MyChange.roles.*;
import myChange.MyChange.statechans.D1.*;

public interface Branch_D1_C_change__C_exit__C_save<__Succ1 extends Succ_In_C_change, __Succ2 extends Succ_In_C_exit, __Succ3 extends Succ_In_C_save> extends Succ_In_C_change, Succ_In_C_save {
	public static final Branch_D1_C_change__C_exit__C_save<?, ?, ?> cast = null;

	abstract Case_D1_C_change__C_exit__C_save<__Succ1, __Succ2, __Succ3> branch(C role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(C role, Handle_D1_C_change__C_exit__C_save<__Succ1, __Succ2, __Succ3> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(C role, Handle_D1_C_change__C_exit__C_save<Succ_In_C_change, Succ_In_C_exit, Succ_In_C_save> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_D1_C_change__C_exit__C_save<?, ?, ?> to(Branch_D1_C_change__C_exit__C_save<?, ?, ?> cast) {
		return (Branch_D1_C_change__C_exit__C_save<?, ?, ?>) this;
	}

	default MyChange_D1_1 to(MyChange_D1_1 cast) {
		return (MyChange_D1_1) this;
	}

public enum Branch_D1_C_change__C_exit__C_save_Enum implements org.scribble.runtime.session.OpEnum {
	change, save, exit
}
}