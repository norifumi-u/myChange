package myChange.MyChange.statechans.D1.ioifaces;

import myChange.MyChange.statechans.D1.EndSocket;

public interface Succ_In_C_exit {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}