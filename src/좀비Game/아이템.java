package 좀비Game;

public class 아이템 {
	 String name;
     int HP;
	 int Attack;

   public String 아이템() {
	return name;	
	}
	
	@Override
	public String toString() {
		return 아이템();
	}
   


    public 아이템( String name, int HP,int Attack) {
    	this.name = name;
    	this.HP = HP;
    	this.Attack = Attack;

    }
   
    

    public void 아이템드랍() {


    }
}


