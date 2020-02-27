package myChange.MyChange.statechans.D1;

import myChange.MyChange.ops.*;
import myChange.MyChange.*;
import myChange.MyChange.roles.*;
import myChange.MyChange.statechans.D1.ioifaces.*;

public interface MyChange_D1_1_Handler extends Handle_D1_C_change__C_exit__C_save<MyChange_D1_1, EndSocket, MyChange_D1_1> {

	@Override
	abstract public void receive(MyChange_D1_1 schan, change op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(MyChange_D1_1 schan, save op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(EndSocket schan, exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}