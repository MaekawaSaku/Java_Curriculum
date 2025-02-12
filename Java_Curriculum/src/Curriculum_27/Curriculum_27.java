package Curriculum_27;

/*

	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
	コンソール出力結果
	
	コンソールに文字を入力してください
	動物名：ライオン
体長：2.1m
速度：80km/h
学名：パンテラ レオ

動物名：ゾウ
体長：3.2m
速度：40km/h
学名：ロキソドンタ・サイクロティス

動物名：パンダ
体長：1.9m
速度：30km/h
学名：アイルロポダ・メラノレウカ

動物名：チンパンジー
体長：0.94m
速度：25km/h
学名：パン・トゥログロディテス

動物名：シマウマ
体長：2.4m
速度：65km/h
学名：チャップマンシマウマ

動物名：インコ
体長：0.1m
速度：50km/h
学名：不明


*/
public class Curriculum_27 {

	private String animal;

	public Curriculum_27(String animal) {
		this.animal = animal;
		if (animal.isEmpty() || animal== null) {
			System.exit(0);
		}
	};

	public void display() {
		String[] comma = this.animal.split(",");
		for (String data : comma) {
			String[] type = data.split(":");
			System.out.println("動物名：" + type[0]);
			System.out.println("体長：" + type[1]);
			System.out.println("速度：" + type[2]);
			System.out.println("学名：" + this.getscholar(type[0]));
			System.out.println();
		}
		;
	}

	private String getscholar(String name) {
		String str;
		switch (name) {
		case "ライオン":
			str = "パンテラ レオ";
			break;
		case "ゾウ":
			str = "ロキソドンタ・サイクロティス";
			break;
		case "パンダ":
			str = "アイルロポダ・メラノレウカ";
		case "チンパンジー":
			str = "パン・トゥログロディテス";
			break;
		case "シマウマ":
			str = "チャップマンシマウマ";
			break;
		default:
			str = "不明";
		}
		return str;
	}

}
