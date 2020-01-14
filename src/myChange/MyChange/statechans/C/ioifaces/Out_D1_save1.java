package myChange.MyChange.statechans.C.ioifaces;

import java.io.IOException;
import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;

public interface Out_D1_save1<__Succ extends Succ_Out_D1_save1> {

	abstract public __Succ send(D1 role, save1 op) throws org.scribble.main.ScribRuntimeException, IOException;
}