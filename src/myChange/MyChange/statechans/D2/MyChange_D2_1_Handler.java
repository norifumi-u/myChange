package myChange.MyChange.statechans.D2;

import myChange.MyChange.ops.exit;
import myChange.MyChange.ops.save2;
import myChange.MyChange.statechans.D2.ioifaces.Handle_D2_S_exit__S_save2;

public interface MyChange_D2_1_Handler extends Handle_D2_S_exit__S_save2<EndSocket, MyChange_D2_1> {

	@Override
	abstract public void receive(MyChange_D2_1 schan, save2 op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(EndSocket schan, exit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}