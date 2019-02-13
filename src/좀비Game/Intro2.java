package 좀비Game;
import java.util.Scanner;

public class Intro2 {
	
	public Intro2 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("다음 스토리를 위해 Enter을 입력해주세요.");
		scanner.nextLine();
		System.out.println("기절했던 파일럿이 깨어났습니다.");
		scanner.nextLine();
		System.out.println("파일럿이 주변을 탐색합니다...");

		Thread athread = new Thread(); { 
		for(int i = 3; i > 0; i--) {
		    System.out.println(+i+"탐색중.. ");
		
		    try {
		      
			Thread.sleep(i * 300);
		    } catch (InterruptedException e) { }
		}
		}
		
		
		System.out.println();
		System.out.println("탐색을 완료하였습니다."); 
		System.out.println("스토리 진행을 위해 Enter을 눌러주세요..");
		System.out.println();
		scanner.nextLine();
		System.out.println("============================= Story ===================================");
		System.out.println();
		System.out.println("파일럿이 불시착 하였던 섬에서는 야만인들이 살고 있었다.. 그것이 바로 문제의 시작이다.");
		System.out.println();
		System.out.println("전투기에 싫고 온 생화학무기 가스가 추락과 함께 섬 전체로 유출되어 버리고 말았고.");
		System.out.println();
		System.out.println("탐색을 완료한 파일럿은 가스를 마신 원주민들에게 무언가 이상한 점을 발견하게 된다..");
		System.out.println();
		System.out.println("=======================================================================");
		System.out.println();
		scanner.nextLine();
		System.out.println("젠장.. 생화학무기 라는 것이 이런 것이었나..?");
		scanner.nextLine();
		System.out.println("좀비로 변하게 하는 무기라니.. 어이가 없군.. 이게 국가에서 비밀리에 만든거라고??");
		scanner.nextLine();
		System.out.println("이건 정말 말도 안되는군.. 잠깐.. 그렇다면 나도 !?");
		scanner.nextLine();
		System.out.println("자신의 몸 상태를 점검합니다 ..");
		scanner.nextLine();
		System.out.println("다행히 전투기 헬멧 덕분에 가스를 마시지 않았구나.. 천만 다행이야.. ");
		scanner.nextLine();
		System.out.println("구조대가 올때까지 어떻게든 살아남아야겠군..");
		scanner.nextLine();
		System.out.println("긴 싸움이 될꺼야..");
		scanner.nextLine();
		System.out.println();
		System.out.println(" 5일 후...");
		scanner.nextLine();
		System.out.println(" ------------------------------------------------------------------------------");
		System.out.println(" 여성좀비와 남성좀비의 능력은 서로 다른 것 같다.. 여성좀비는 어째 더 민첩하다..하지만 강하지는");
		System.out.println(" 않는 것 같았다.. ");
		System.out.println(" 반면 남성좀비는 그리 민첩하지는 않지만 힘이 아주 좋은 것 같다.. 그의 공격에 조심해야겠다.. ");
		scanner.nextLine();
		System.out.println(" 그리고 ..");
		scanner.nextLine();
		System.out.println(" 밤이되면 땅이 매번 크게 흔들린다.. 지진은 아닌 것 같다.. 알 수 없는 존재가 있는 것 같다.. 조심하자..");
		System.out.println(" ------------------------------------------------------------------------------");
		System.out.println();
		System.out.println(" =========================게임을 시작합니다.================================");
		System.out.println("+++++++++++++다음날 아침에 구조대가 옵니다. 오늘 하루를 생존해야 합니다.++++++++++++++");
		scanner.nextLine();
		System.out.println();
	    
	}
}

