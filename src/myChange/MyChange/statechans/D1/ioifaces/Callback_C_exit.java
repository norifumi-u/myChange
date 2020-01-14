package myChange.MyChange.statechans.D1.ioifaces;

import java.io.IOException;
import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;

public interface Callback_C_exit<__Succ extends Succ_In_C_exit> {

	abstract public void receive(__Succ schan, exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}