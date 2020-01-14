package myChange.MyChange.statechans.S.ioifaces;

import myChange.MyChange.statechans.S.MyChange_S_1;

public interface Select_S_D2_exit__D2_save2<__Succ1 extends Succ_Out_D2_exit, __Succ2 extends Succ_Out_D2_save2> extends Out_D2_exit<__Succ1>, Out_D2_save2<__Succ2>, Succ_Out_D2_save2 {
	public static final Select_S_D2_exit__D2_save2<?, ?> cast = null;

	@Override
	default Select_S_D2_exit__D2_save2<?, ?> to(Select_S_D2_exit__D2_save2<?, ?> cast) {
		return (Select_S_D2_exit__D2_save2<?, ?>) this;
	}

	default MyChange_S_1 to(MyChange_S_1 cast) {
		return (MyChange_S_1) this;
	}
}