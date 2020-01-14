package myChange.MyChange.statechans.D1.ioifaces;

import myChange.MyChange.ops.*;

public interface Case_D1_C_change__C_exit__C_save1<__Succ1 extends Succ_In_C_change, __Succ2 extends Succ_In_C_exit, __Succ3 extends Succ_In_C_save1> extends In_C_change<__Succ1>, In_C_exit<__Succ2>, In_C_save1<__Succ3> {
	public static final Branch_D1_C_change__C_exit__C_save1<?, ?, ?> cast = null;

	abstract Branch_D1_C_change__C_exit__C_save1.Branch_D1_C_change__C_exit__C_save1_Enum getOp();

	abstract public __Succ1 receive(change op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public myChange.MyChange.statechans.D1.EndSocket receive(exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ3 receive(save1 op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}