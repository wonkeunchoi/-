package 좀비Game;
import java.util.Random;

public class 동물종류 implements 동물 {


	public int SPEED_MAX = 100;

	String name;
	int Attack;
	int HP;
	int Speed;
	아이템 item;
	int Item_Ability;

	public 동물종류(String name, int HP, int Attack,int Speed, 아이템 item, int Item_Ability) {
		this.name = name;
		this.Attack = Attack;
		this.HP = HP;
		this.Speed = Speed;
		this.item = item;
		this.Item_Ability = Item_Ability;

	}
	public boolean be_damaged (int pilot_attack){
		boolean val = new Random().nextInt(SPEED_MAX/(SPEED_MAX-this.Speed))==0;// 100 -  20 = 얻어맞을 확률 : 80 
		if(val) { // 얻어맞았다!
			this.HP = this.HP - pilot_attack; // HP가 깎였다.
			return true; // 얻어맞은 사실을 알린다.
		}else return false; // 회피했다!
	}

	public boolean 생존() {

		if ( HP <= 0 ) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public void 정보() {
		
		System.out.println(">>>>>>>>>> " +name+ "의 정보입니다 <<<<<<<<");
		System.out.println();
		System.out.println("이름 : " +name);
		System.out.println("HP  : " +HP);
		System.out.println("공격력 : " +Attack);
		System.out.println("회피율 : " +Speed);
		System.out.println("아이템드랍 : " +item);
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<<");
		System.out.println();
	}

	@Override
	public void 공격() {		
		System.out.println(name+"이(가) 공격하였습니다");
		System.out.println();

	}

	@Override
	public void HP() {
		System.out.println(name+"의 HP : " +HP);
		System.out.println();


	}
	@Override
	public void 회피() {
		System.out.println(name+"이(가) 회피하였습니다");
		System.out.println();
		this.Speed += Speed;
	}

	@Override
	public void 달아나기() {
		System.out.println(name+"이(가) 달아났습니다");
		System.out.println();
	}

	@Override
	public 아이템 아이템드랍() {
		System.out.println("@@@@@@@@@@@@@"+name+"에게서 "+item+ "을 흭득하였습니다.@@@@@@@@@@@@@@");
		System.out.println();
		return item;
	}
	
	

	/*public void 인벤토리_아이템(String name) {
		for(int i = 0;i < 인벤토리.length; i++) {
			if(인벤토리[i] == null) {
				인벤토리[i] = name;

				System.out.println(name+"");
				return;
			}
		}
	} 
	private static String 인벤토리[] = new String[10];	
	*/
}


