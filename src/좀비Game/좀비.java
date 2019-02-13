package 좀비Game;
public class 좀비 extends 유닛 {

	int Skill;
	int Skill2;

	public 좀비(String name,int HP, int Attack, int Speed,int Skill,int Skill2){
		super(name,HP,Attack,Speed,Skill,Skill2);

		this.Skill = Skill;
		this.Skill2 = Skill2;

	}

	//쓰레드로 좀비등장 음악

	public void 분노() {
		if (HP <= 25) {
			System.out.println();
			System.out.println("!!남성좀비가 분노스킬을 사용하였습니다!! 추가데미지 : +15");
			this.Attack += 15;  //남성좀비 공격력 상승
		}
	}

	public void 은신() {
		if (HP <= 20) {	

			System.out.println();
			System.out.println("여성좀비의 스킬 : 은신(가) 발동되었습니다.");
			System.out.println("은신 : 회피율 + 30" );
			this.Speed += 30;
		}
	}
}