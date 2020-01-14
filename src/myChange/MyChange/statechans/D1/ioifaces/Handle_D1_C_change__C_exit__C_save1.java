package myChange.MyChange.statechans.D1.ioifaces;

import myChange.MyChange.ops.*;

public interface Handle_D1_C_change__C_exit__C_save1<__Succ1 extends Succ_In_C_change, __Succ2 extends Succ_In_C_exit, __Succ3 extends Succ_In_C_save1> extends Callback_C_change<__Succ1>, Callback_C_exit<__Succ2>, Callback_C_save1<__Succ3> {

	abstract public void receive(__Succ1 schan, change op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ3 schan, save1 op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}