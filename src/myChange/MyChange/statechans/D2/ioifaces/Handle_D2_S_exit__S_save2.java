package myChange.MyChange.statechans.D2.ioifaces;

import myChange.MyChange.ops.exit;
import myChange.MyChange.ops.save2;

public interface Handle_D2_S_exit__S_save2<__Succ1 extends Succ_In_S_exit, __Succ2 extends Succ_In_S_save2> extends Callback_S_exit<__Succ1>, Callback_S_save2<__Succ2> {

	abstract public void receive(__Succ1 schan, exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, save2 op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}