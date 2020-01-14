package myChange.MyChange.statechans.C.ioifaces;

import myChange.MyChange.statechans.C.EndSocket;

public interface Succ_Out_D1_exit {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}