package myChange.MyChange.statechans.S.ioifaces;

import java.io.IOException;
import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;

public interface Out_D2_save<__Succ extends Succ_Out_D2_save> {

	abstract public __Succ send(D2 role, save op) throws org.scribble.main.ScribRuntimeException, IOException;
}