package myChange.MyChange.statechans.D2.ioifaces;

import myChange.MyChange.statechans.D2.EndSocket;

public interface Succ_In_S_exit {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}