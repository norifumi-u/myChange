package myChange.MyChange.statechans.D1.ioifaces;

import myChange.MyChange.ops.*;

public interface Case_D1_C_change__C_exit__C_save<__Succ1 extends Succ_In_C_change, __Succ2 extends Succ_In_C_exit, __Succ3 extends Succ_In_C_save> extends In_C_change<__Succ1>, In_C_exit<__Succ2>, In_C_save<__Succ3> {
	public static final Branch_D1_C_change__C_exit__C_save<?, ?, ?> cast = null;

	abstract Branch_D1_C_change__C_exit__C_save.Branch_D1_C_change__C_exit__C_save_Enum getOp();

	abstract public __Succ1 receive(change op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public myChange.MyChange.statechans.D1.EndSocket receive(exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ3 receive(save op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}