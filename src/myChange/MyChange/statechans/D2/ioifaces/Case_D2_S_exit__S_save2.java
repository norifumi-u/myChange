package myChange.MyChange.statechans.D2.ioifaces;

import myChange.MyChange.ops.exit;
import myChange.MyChange.ops.save2;

public interface Case_D2_S_exit__S_save2<__Succ1 extends Succ_In_S_exit, __Succ2 extends Succ_In_S_save2> extends In_S_exit<__Succ1>, In_S_save2<__Succ2> {
	public static final Branch_D2_S_exit__S_save2<?, ?> cast = null;

	abstract Branch_D2_S_exit__S_save2.Branch_D2_S_exit__S_save2_Enum getOp();

	abstract public myChange.MyChange.statechans.D2.EndSocket receive(exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ2 receive(save2 op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}