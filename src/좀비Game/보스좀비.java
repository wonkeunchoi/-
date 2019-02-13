package 좀비Game;

public class 보스좀비 extends 좀비 implements 보스좀비명령 {

	String SkillName;
	String SkillName2;

public 보스좀비(String name, int HP, int Attack, int Speed, int Skill,int Skill2,String SkillName,String SkillName2) {
super(name, HP, Attack, Speed, Skill, Skill2);
this.SkillName = SkillName;
this.SkillName2 = SkillName2;

}
 
    
	@Override
	public void 정보() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 공격() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 회피() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 스킬1() {
		System.out.println();
		System.out.println(name+"의 스킬 : " +SkillName+ "이(가) 발동되었습니다.");
        System.out.println(SkillName+" 데미지 :" +Skill);
        System.out.println();
        	
	}
	@Override
	public void 스킬2() {
		System.out.println(name+"의 스킬 : " +SkillName2+ " 이(가) 발동되었습니다.");
        System.out.println(SkillName2+ " 데미지 : " +Skill2 );
        System.out.println();
	}
}
