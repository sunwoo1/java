
public class BattleTest {
	public static void main(String[] args){
		Player p = new Player();
		Monster m = new Monster();

		while(true){
			int a = m.attack();
			int b = p.attack();
			
			p.hp = p.hp - a;
			System.out.println("�÷��̾" +a+"�� ���ظ� ����");
			System.out.println("�÷��̾��� HP:"+p.hp+"\n");
			if(p.hp <= 0){
				System.out.println("���� ��");
				break;
			}
			m.hp = m.hp - b;
			System.out.println("���Ͱ�" +b+"�� ���ظ� ����");
			System.out.println("������ HP:"+m.hp+"\n");
			if(m.hp <= 0){
				System.out.println("�÷��̾� ��");
				break;
			}
			
		}
			
	}
}
