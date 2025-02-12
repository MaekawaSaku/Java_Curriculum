package Curriculum_27;

import java.util.Scanner;

public class Curriculum_27_process {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("コンソールに文字を入力してください");
		String animal = scan.nextLine();
		
		
		Curriculum_27 monster =new Curriculum_27(animal);
		
		monster.display();

		scan.close();}

}
