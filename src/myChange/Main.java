package myChange;

import java.io.IOException;

public class Main {

	public static abstract class MyRunnable implements Runnable {
		abstract public void myrun() throws Exception;

		public void run() {
			try {
				myrun();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException, IOException {
//		try (
//				ScribServerSocket s1 = new SocketChannelServer(8888);
//			 	ScribServerSocket s2 = new SocketChannelServer(7777)) {
			var changer = new Thread(new MyRunnable() {
				@Override
				public void myrun() throws Exception {
					Changer.run();
				}
			});
			var saver = new Thread(new MyRunnable() {
				@Override
				public void myrun() throws Exception {
					Saver.run();
				}
			});
//			var data = new Thread(new MyRunnable() {
//				@Override
//				public void myrun() throws Exception {
//					Data.run(s1, s2);
//				}
//			});
//			data.start();
			changer.start();
			saver.start();
//		}
	}

}
