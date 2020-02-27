package myChange.MyChange.statechans.D2.ioifaces;

import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;
import myChange.MyChange.statechans.D2.*;

public interface Receive_D2_S_save<__Succ1 extends Succ_In_S_save> extends In_S_save<__Succ1>, Succ_In_S_save {
	public static final Receive_D2_S_save<?> cast = null;

	abstract public __Succ1 async(S role, save op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_D2_S_save<?> to(Receive_D2_S_save<?> cast) {
		return (Receive_D2_S_save<?>) this;
	}

	default MyChange_D2_1 to(MyChange_D2_1 cast) {
		return (MyChange_D2_1) this;
	}
}