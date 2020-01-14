package myChange.MyChange.statechans.D2.ioifaces;

import myChange.MyChange.ops.save2;

public interface Callback_S_save2<__Succ extends Succ_In_S_save2> {

	abstract public void receive(__Succ schan, save2 op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}