package ex05_static;

public class StaticTest {
	static int count = 0;
	public StaticTest(){
		count++;
		System.out.println(count);
	}
	
	public static int getCount(){
		return count;
	}
	
	public static void main(String[] args) {
		StaticTest s1 = new StaticTest();
		StaticTest s2 = new StaticTest();
		StaticTest s3 = new StaticTest();
		System.out.println(StaticTest.getCount());
	}

}
