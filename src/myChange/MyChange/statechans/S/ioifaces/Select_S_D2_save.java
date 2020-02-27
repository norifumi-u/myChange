package myChange.MyChange.statechans.S.ioifaces;

import myChange.MyChange.roles.*;
import myChange.MyChange.statechans.S.*;

public interface Select_S_D2_save<__Succ1 extends Succ_Out_D2_save> extends Out_D2_save<__Succ1>, Succ_Out_D2_save {
	public static final Select_S_D2_save<?> cast = null;

	@Override
	default Select_S_D2_save<?> to(Select_S_D2_save<?> cast) {
		return (Select_S_D2_save<?>) this;
	}

	default MyChange_S_1 to(MyChange_S_1 cast) {
		return (MyChange_S_1) this;
	}
}