package myChange.MyChange.statechans.D2.ioifaces;

public interface Succ_In_S_save {

	default Receive_D2_S_save<?> to(Receive_D2_S_save<?> cast) {
		return (Receive_D2_S_save<?>) this;
	}
}