package myChange.MyChange.statechans.D2;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class MyChange_D2_1_Future extends org.scribble.runtime.util.ScribFuture {

	protected MyChange_D2_1_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public MyChange_D2_1_Future sync() throws IOException {
		super.get();
		return this;
	}
}