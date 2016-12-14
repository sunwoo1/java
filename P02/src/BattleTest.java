
public class BattleTest {
	public static void main(String[] args){
		Player p = new Player();
		Monster m = new Monster();

		while(true){
			int a = m.attack();
			int b = p.attack();
			
			p.hp = p.hp - a;
			System.out.println("플레이어가" +a+"의 피해를 입음");
			System.out.println("플레이어의 HP:"+p.hp+"\n");
			if(p.hp <= 0){
				System.out.println("몬스터 승");
				break;
			}
			m.hp = m.hp - b;
			System.out.println("몬스터가" +b+"의 피해를 입음");
			System.out.println("몬스터의 HP:"+m.hp+"\n");
			if(m.hp <= 0){
				System.out.println("플레이어 승");
				break;
			}
			
		}
			
	}
}
