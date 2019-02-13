package 좀비Game;

public class 전투기이동 {

	public 전투기이동() {

		Thread athread = new Thread(); { 
			for(int i = 3; i > 0; i--) {
				System.out.println(+i+"초 랩터 A-5 이동중.. ");

				try {

					Thread.sleep(i * 500);
				} catch (InterruptedException e) { }
			}
		}
	}
}
