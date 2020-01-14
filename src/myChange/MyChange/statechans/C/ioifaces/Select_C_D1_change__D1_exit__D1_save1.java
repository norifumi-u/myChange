package myChange.MyChange.statechans.C.ioifaces;

import myChange.MyChange.roles.*;
import myChange.MyChange.statechans.C.*;

public interface Select_C_D1_change__D1_exit__D1_save1<__Succ1 extends Succ_Out_D1_change, __Succ2 extends Succ_Out_D1_exit, __Succ3 extends Succ_Out_D1_save1> extends Out_D1_change<__Succ1>, Out_D1_exit<__Succ2>, Out_D1_save1<__Succ3>, Succ_Out_D1_change, Succ_Out_D1_save1 {
	public static final Select_C_D1_change__D1_exit__D1_save1<?, ?, ?> cast = null;

	@Override
	default Select_C_D1_change__D1_exit__D1_save1<?, ?, ?> to(Select_C_D1_change__D1_exit__D1_save1<?, ?, ?> cast) {
		return (Select_C_D1_change__D1_exit__D1_save1<?, ?, ?>) this;
	}

	default MyChange_C_1 to(MyChange_C_1 cast) {
		return (MyChange_C_1) this;
	}
}