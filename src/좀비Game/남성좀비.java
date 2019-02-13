package 좀비Game;

public class 남성좀비 extends 좀비{  

	남성좀비(String name, int HP, int Attack, int Speed, int Skill,int Skill_name) {

		super(name, HP, Attack, Speed, Skill,Skill_name);

		this.Skill = Skill;
		this.Skill2 = Skill2;
	}

	public void 물어뜯기() {

		System.out.println("남성좀비의 스킬 : 물어뜯기(가) 발동되었습니다.");
		System.out.println("물어뜯기 데미지 : 40" );
		Skill -= 40;
	}
	public void 분노() {
		if (HP <= 25) 
			System.out.println("!!남성좀비가 분노스킬을 사용하였습니다!! 추가데미지 : +15");
		this.Attack += 15;  //남성좀비 공격력 상승


	}
}
