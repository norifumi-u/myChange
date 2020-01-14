package myChange.MyChange.statechans.D2.ioifaces;

import myChange.MyChange.roles.S;
import myChange.MyChange.statechans.D2.MyChange_D2_1;

public interface Branch_D2_S_exit__S_save2<__Succ1 extends Succ_In_S_exit, __Succ2 extends Succ_In_S_save2> extends Succ_In_S_save2 {
	public static final Branch_D2_S_exit__S_save2<?, ?> cast = null;

	abstract Case_D2_S_exit__S_save2<__Succ1, __Succ2> branch(S role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(S role, Handle_D2_S_exit__S_save2<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(S role, Handle_D2_S_exit__S_save2<Succ_In_S_exit, Succ_In_S_save2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_D2_S_exit__S_save2<?, ?> to(Branch_D2_S_exit__S_save2<?, ?> cast) {
		return (Branch_D2_S_exit__S_save2<?, ?>) this;
	}

	default MyChange_D2_1 to(MyChange_D2_1 cast) {
		return (MyChange_D2_1) this;
	}

public enum Branch_D2_S_exit__S_save2_Enum implements org.scribble.runtime.session.OpEnum {
	save2, exit
}
}