package 좀비Game;


public class 동물정보 {
	public int SPEED_MAX = 100;
	
		String name;
		int Attack;
		int HP;
		int Speed;
		아이템 item;
		int Item_Ability;

		public void 능력치(String name,int HP, int Attack, int Speed, 아이템 item, int Item_Ability) {
			this.name = name;
			this.Attack = Attack;
			this.HP = HP;
			this.Speed = Speed;
			this.Item_Ability = Item_Ability;			
			this.item = item;

		}	
}