package myChange.MyChange.statechans.D2.ioifaces;

import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;
import myChange.MyChange.statechans.D2.*;

public interface Receive_D2_S_save2<__Succ1 extends Succ_In_S_save2> extends In_S_save2<__Succ1>, Succ_In_S_save2 {
	public static final Receive_D2_S_save2<?> cast = null;

	abstract public __Succ1 async(S role, save2 op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_D2_S_save2<?> to(Receive_D2_S_save2<?> cast) {
		return (Receive_D2_S_save2<?>) this;
	}

	default MyChange_D2_1 to(MyChange_D2_1 cast) {
		return (MyChange_D2_1) this;
	}
}