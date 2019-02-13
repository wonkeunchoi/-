package 좀비Game;

public class musicplayer {
	
	Music intro1Music;
    Music intro2Music;
    Music intro3Music;
    Music intro4Music;
    Music intro5Music;
    Music intro6Music;
    Music intro7Music;
    Music intro8Music;
    
	public void musicplayer1() {
		intro1Music = new Music("스토리-음악.mp3",true);		
		intro1Music.start();	
	}

	public void musicplayer2() {
		intro2Music = new Music("전투기소리.mp3",true);		
		intro2Music.start();	
	}
	public void musicplayer3() {
		intro3Music = new Music("폭발.mp3",true);		
		intro3Music.start();	
	}

	public void musicplayer4() {
		intro4Music = new Music("대화창-음악.mp3",true);		
		intro4Music.start();		
	}

	public void musicplayer5() {
		intro5Music = new Music("권총.mp3",true);		
		intro5Music.start();		
	}

	public void musicplayer6() {
		intro6Music = new Music("남성좀비-싸우기_1.mp3",true);		
		intro6Music.start();
	}
	public void musicplayer7() {
		intro7Music = new Music("배틀.mp3",true);		
		intro7Music.start();
	}
	public void musicplayer8() {
		intro8Music = new Music("장전소리.mp3",true);
		intro8Music.start();
	}
}
