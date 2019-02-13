package 좀비Game;

import javazoom.jl.player.Player;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Music extends Thread{
	private Player player;
	private boolean isLoop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;

	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			//getClass().getDirectory()
			// . : 현재 경로
			// .. : 상위 경로
			file = new File(메인.class.getResource("../music/" +name).toURI());		
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getTime() {  // 현재 실행되고 있는 음악이 어떤 위치에서 실행되는지 알려줌 
		if (player == null)
			return 0;
		return player.getPosition();

	}
	public void close () {  //언제 실행되든간에 항상 정지할 수 있도록 해주는 함수. 
		isLoop = false;
		player.close();
		this.interrupt(); // interrupt : 곡을 종료해줌.
	}

	@Override
	public void run() {  // 쓰레드를 상속받으면 무조건 사용해야하는 함수.
		try {
			do {  // 중요 : 곡을 실행시키기.
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);

			}
			while (isLoop);  // isLoop가 True값이면 위 do {   } 함수 무한 반복. isLoop가 True면 곡 무한재생.
		}
		catch (Exception e) {
			System.out.println(e. getMessage()); //오류가 발생할 경우 오류메세지 출력.

		}
	}
}


