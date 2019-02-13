package 좀비Game;

public class 쓰레드_로딩중 {

	public void run(){
		for(int i = 0; i < 1; i++) {
			
			System.out.print("로딩중 ");
			
			 for ( int b = 0; b < 8; b++) {
			    	System.out.print(">>>");

					try {
						Thread.sleep(400);
						
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					
				}
			 System.out.println("완료");
		}

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
