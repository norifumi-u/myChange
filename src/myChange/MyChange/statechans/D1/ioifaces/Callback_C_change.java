package myChange.MyChange.statechans.D1.ioifaces;

import java.io.IOException;
import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;

public interface Callback_C_change<__Succ extends Succ_In_C_change> {

	abstract public void receive(__Succ schan, change op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}