package myChange.MyChange.statechans.D1.ioifaces;

import java.io.IOException;
import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;

public interface Callback_C_save<__Succ extends Succ_In_C_save> {

	abstract public void receive(__Succ schan, save op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}