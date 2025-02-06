package curriculam20_22;

import curriculum20_22_process.Curriculum_New_1_20_22_process;

public class Curriculum_New_1_20_22 {

	public static void main(String[] args) {
		/*
		 
		下記がコンソールに出力されるように作成してください
		
			こんにちは！ここは日本です！
			この寿司はうまい
			寿司は和食です
			今の現在日時は2023/03/09 10:23:39です
		
		【条件】
			・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
			・適切なファイルにフィールドで変数を必要な数作ってください。
			・thisを使って作成してください。
			・日時は今日の日付を取得してください。
			
		*/
		Curriculum_New_1_20_22_process japan = new Curriculum_New_1_20_22_process("日本");
		japan.hello();
		japan.hello2();
		japan.hello3();
		japan.hello4();

		/*System.out.println();
		
		Curriculum_New_1_20_22_process china = new Curriculum_New_1_20_22_process("中国");
		china.hello();
		china.hello2();
		china.hello3();
		china.hello4();
		
		System.out.println();
		
		Curriculum_New_1_20_22_process noone = new Curriculum_New_1_20_22_process();
		noone.hello();
		noone.hello2();
		noone.hello3();
		noone.hello4(); */
	}

}
