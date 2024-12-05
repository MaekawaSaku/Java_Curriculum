package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qus1_3 {

	public static void main(String[] args) {
		/*1.ログイン時の入力チェックシステムを下記条件で作成してください
		 * ・コンソールにユーザー名を入力できるようにしてください						
		 * ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		 * ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		 * ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		 * */

		Scanner scan = new Scanner(System.in);

		boolean check = false;
		String name;
		do {
			System.out.print("ユーザー名： ");
			name = scan.nextLine();

			if (name.length() > 10) {
				System.out.println("名前を10文字以内にしてください");
			}

			else if (name.isEmpty() || name.length() == 0) {
				System.out.println("名前を入力してください");
			}

			else {
				check = true;
			}
		} while (!check);
		System.out.println("「ユーザー名「" + name + " 」を登録しました」");

		//2.ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください

		check = false;
		do {
			System.out.print("ユーザー名： ");
			name = scan.nextLine();

			if (name.length() > 10) {
				System.out.println("名前を10文字以内にしてください");
			}

			else if (name.isEmpty() || name.length() == 0) {
				System.out.println("名前を入力してください");
			} else if (!name.matches("[0-9a-zA-Z]+")) {
				System.out.println("半角英数字のみで名前を入力してください");
			}

			else {
				check = true;
			}
		} while (!check);
		System.out.println();
		System.out.println("「ユーザー名「" + name + " 」を登録しました」");

		/*3. じゃんけんのシステムを下記の条件で作成してください							
		・「0はグー、1：チョキ、2：パー」とすること							
		・じゃんけんに勝つまでループすること							
		・一回ごとに自分の手と相手の手を下記の通り出力してください							
			ユーザー名「name」を登録しました						
			nameの手は「パー」						
			相手の手は「グー」	*/
		Random random = new Random();
		int myHand = random.nextInt(3);

		int fowsHand = random.nextInt(3);

		/*・条件分岐の設定							
		・自分がじゃんけんに勝った場合、下記が出力されるようにしてください							
			やるやん。						
			次は俺にリベンジさせて						
									
		・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください							
			俺の勝ち！						
			負けは次につながるチャンスです！						
			ネバーギブアップ！						
									
		・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください							
			俺の勝ち！						
			たかがじゃんけん、そう思ってないですか？						
			それやったら次も、俺が勝ちますよ						
									
		・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください							
			俺の勝ち！						
			なんで負けたか、明日まで考えといてください。						
			そしたら何かが見えてくるはずです						
									
		・あいこの場合、下記が出力されるようにしてください							
			DRAW あいこ もう一回しましょう！						
									
		じゃんけんを行った回数を表示してください							
			勝つまでにかかった合計回数は1回です	*/
		check = false;
		int count = 0;
		do {
			myHand = random.nextInt(3);

			fowsHand = random.nextInt(3);

			if (myHand == 0) {
				System.out.println(name + "の手は「グー」");
			}
			if (myHand == 1) {
				System.out.println(name + "の手は「チョキ」");
			}
			if (myHand == 2) {
				System.out.println(name + "の手は「パー」");
			}

			if (fowsHand == 0) {
				System.out.println("相手の手は「グー」");
			}
			if (fowsHand == 1) {
				System.out.println("相手の手は「チョキ」");
			}
			if (fowsHand == 2) {
				System.out.println("相手の手は「パー」");
			}
			count++;
			if (fowsHand == 0 && myHand == 1) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
			}

			else if (fowsHand == 1 && myHand == 2) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
			}

			else if (fowsHand == 2 && myHand == 0) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
			}

			else if (fowsHand == myHand) {
				System.out.println("DRAW あいこ もう一回しましょう！");
			} else {
				check = true;
			}
		} while (!check);
		System.out.println("やるやん。");
		System.out.println("次は俺にリベンジさせて。");
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");
	}

}