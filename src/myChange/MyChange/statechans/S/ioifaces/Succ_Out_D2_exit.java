package myChange.MyChange.statechans.S.ioifaces;

import myChange.MyChange.statechans.S.EndSocket;

public interface Succ_Out_D2_exit {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}