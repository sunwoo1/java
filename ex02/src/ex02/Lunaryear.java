package ex02;

import java.util.Scanner;

public class Lunaryear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if(year % 4 == 0){
			if(year % 400 == 0){
				System.out.println(year+"���� �����Դϴ�.");
			}else if(year % 100 == 0){
				System.out.println(year+"���� ����Դϴ�.");
			}
			System.out.println(year+"���� �����Դϴ�.");
		}else{
			System.out.println(year+"���� ����Դϴ�.");
		} 
			scanner.close();

	}

}