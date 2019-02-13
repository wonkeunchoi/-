package 좀비Game;

public class 파일럿 extends 유닛  {
	 
	private int Skill;  //사용횟수 2번.
	public 인벤토리 inven;
	
 public 파일럿 (String name, int HP, int Attack, int Speed,int Skill,int Skill2){
	 super(name,HP,Attack,Speed,Skill,Skill2);
	 this.HP = HP;
	 this.inven = new 인벤토리();
	 
 }
 public void information() {
 	System.out.println();
		System.out.println("==========="+name+"의 정보==========");
		System.out.println();
		System.out.println(name+"의 생명력 : "+ HP );
		System.out.println(name+"의 맨손공격력 : 15");
		System.out.println(name+"의 속도 : "+ Speed);
		System.out.println();
		System.out.println("====================================");   	
 }
}
