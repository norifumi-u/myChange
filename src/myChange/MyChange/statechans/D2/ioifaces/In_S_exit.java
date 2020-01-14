package myChange.MyChange.statechans.D2.ioifaces;

import myChange.MyChange.ops.exit;
import myChange.MyChange.roles.S;

public interface In_S_exit<__Succ extends Succ_In_S_exit> {

	abstract public __Succ receive(S role, exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}