package myChange.MyChange.statechans.C.ioifaces;

import java.io.IOException;
import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;

public interface Out_D1_exit<__Succ extends Succ_Out_D1_exit> {

	abstract public __Succ send(D1 role, exit op) throws org.scribble.main.ScribRuntimeException, IOException;
}