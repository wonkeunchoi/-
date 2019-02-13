package 좀비Game;

public class 인벤토리  {

	
	아이템[] 아이템들;
	int size;

	public 인벤토리() {
		size = 0;
		아이템들 = new 아이템[15];
	}

	public void 아이템_보기() {	
		
		for(int i = 0;i < size; i++) {
			if(아이템들[i] != null) {
				System.out.println("["+i+1+"]" + 아이템들[i].name+"");
				return;
			}
		}
	} 

	public 아이템 꺼내기(int index) { /* 아직 불완전함 */
		size--;
		return 아이템들[index];
	}

	public void 아이템넣기(아이템 item) {
		아이템들[size] = item;
		size++;
	}

	public void 조합하기() {

	}

}
