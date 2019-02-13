package 좀비Game;
import java.util.Random;

public class 유닛 {
	public static int SPEED_MAX = 100;
	
    String name;
    int HP;
    int Attack;
    int Speed;
    int Skill;
    int Skill2;
    
    public 유닛(String name, int HP,int Attack,int Speed, int Skill,int skill2) {
     
     this.name = name;
   	 this.HP = HP;
   	 this.Attack = Attack;
   	 this.Speed = Speed;
   	 this.Skill = Skill;
   	 this.Skill2 = skill2;
   	 
    }
    
 public boolean 생존() {
    	
    	if ( HP <= 0 ) {
			return false;
		}
		else {
			return true;
		}
	}
    public boolean be_damaged (int pilot_attack){
		boolean val = new Random().nextInt(SPEED_MAX/(SPEED_MAX-this.Speed))==0;// 100 -  20 = 얻어맞을 확률 : 80 
		if(val) { // 얻어맞았다!
			this.HP = this.HP - pilot_attack; // HP가 깎였다.
			return true; // 얻어맞은 사실을 알린다.
		}else return false; // 회피했다!
    }
    
    public void information() {
    	System.out.println();
		System.out.println("==========="+name+"의 정보==========");
		System.out.println();
		System.out.println(name+"의 생명력 : "+ this.HP );
		System.out.println(name+"의 공격력 : "+ this.Attack);
		System.out.println(name+"의 속도 : "+ this.Speed);
		System.out.println();
		System.out.println("====================================");   	
    }
    
	public void HP() {
	    System.out.println();		
		System.out.println(name+"의 생명력 :" + HP + "");
		System.out.println();
	}
}


