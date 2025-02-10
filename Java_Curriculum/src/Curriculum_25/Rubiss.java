package Curriculum_25;

import java.util.Random;
import java.util.Scanner;

import Curriculum_25_process.Hero;

/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/

public class Rubiss {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("なまえをいれてください:");
		String name=scan.nextLine();
	Hero hero = new Hero(name);
	Random random = new Random();
	
	hero.setHitpoint(random.nextInt(1000) + 1);
	hero.setMagicpoint(random.nextInt(1000) + 1);
	hero.setAttack(random.nextInt(1000) + 1);
	hero.setSpeed(random.nextInt(1000) + 1);
	hero.setDefence(random.nextInt(1000) + 1);
	
	hero.display();
	hero.hello();
	
	
	scan.close();}
	
}
