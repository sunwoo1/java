import java.util.Random;

public class Monster extends Character{
	int hp = 100;
	@Override
	
	public int attack(){
		Random random = new Random();
		return random.nextInt(10);
	}
}
