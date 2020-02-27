package myChange.MyChange.statechans.D2.ioifaces;

import java.io.IOException;
import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;

public interface In_S_save<__Succ extends Succ_In_S_save> {

	abstract public __Succ receive(S role, save op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}