package myChange.MyChange.statechans.S.ioifaces;

import java.io.IOException;

import myChange.MyChange.ops.exit;
import myChange.MyChange.roles.D2;

public interface Out_D2_exit<__Succ extends Succ_Out_D2_exit> {

	abstract public __Succ send(D2 role, exit op) throws org.scribble.main.ScribRuntimeException, IOException;
}