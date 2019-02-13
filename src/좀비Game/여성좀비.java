package 좀비Game;

public class 여성좀비 extends 좀비{



public 여성좀비(String name, int HP, int Attack, int Speed, int Skill, int Skill2) {
super(name, HP, Attack, Speed, Skill, Skill2);   

}

public void 할퀴기(좀비 여성좀비) {	
	
	System.out.println("여성좀비의 스킬 : 할퀴기(가) 발동되었습니다.");
    System.out.println("할퀴기 데미지 : 30" );
    this.Attack += 15;
    
	}
}
