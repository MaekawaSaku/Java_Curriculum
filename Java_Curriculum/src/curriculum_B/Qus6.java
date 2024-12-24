package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qus6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String machine;
		machine = scan.nextLine();
		// System.out.println("str: " + machine);
		String[] name = machine.split("、");

		Random random = new Random();
		int stock;
		int tvstock = random.nextInt(12);
		int disstock = 11 - tvstock;
		for (String list : name) {
			stock = random.nextInt(12);

			switch (list) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + stock + "台です");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + stock + "台です");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + stock + "台です");
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + stock + "台です");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + stock + "台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				System.out.println(list.equals("テレビ") ? "テレビの残り台数は" + tvstock + "台です"
						: "ディスプレイの残り台数は" + disstock + "台です");
				break;
			default:
				System.out.println("『 " + list + " 』は指定の商品ではありません");
			}
		}
		scan.close();}
};
