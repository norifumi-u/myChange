package myChange.MyChange.statechans.D2.ioifaces;

import myChange.MyChange.ops.exit;

public interface Callback_S_exit<__Succ extends Succ_In_S_exit> {

	abstract public void receive(__Succ schan, exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}