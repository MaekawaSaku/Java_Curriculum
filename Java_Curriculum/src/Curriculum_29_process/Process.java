package Curriculum_29_process;

import java.util.Scanner;

import Curriculum_29.Prefectures;

public class Process {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("都道府県番号を入力してください。");
		String number = scan.nextLine();
		System.out.println("昇順、降順を入力してください。");
		String order = scan.nextLine();

		Prefectures city = new Prefectures(number, order);

		city.display();

		scan.close();
	}
}
