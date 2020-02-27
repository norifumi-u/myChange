package myChange.MyChange.statechans.C.ioifaces;

import myChange.MyChange.roles.*;
import myChange.MyChange.statechans.C.*;

public interface Select_C_D1_change__D1_exit__D1_save<__Succ1 extends Succ_Out_D1_change, __Succ2 extends Succ_Out_D1_exit, __Succ3 extends Succ_Out_D1_save> extends Out_D1_change<__Succ1>, Out_D1_exit<__Succ2>, Out_D1_save<__Succ3>, Succ_Out_D1_save, Succ_Out_D1_change {
	public static final Select_C_D1_change__D1_exit__D1_save<?, ?, ?> cast = null;

	@Override
	default Select_C_D1_change__D1_exit__D1_save<?, ?, ?> to(Select_C_D1_change__D1_exit__D1_save<?, ?, ?> cast) {
		return (Select_C_D1_change__D1_exit__D1_save<?, ?, ?>) this;
	}

	default MyChange_C_1 to(MyChange_C_1 cast) {
		return (MyChange_C_1) this;
	}
}