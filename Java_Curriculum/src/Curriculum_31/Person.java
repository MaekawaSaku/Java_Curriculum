package Curriculum_31;

/*問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）

問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください

問題3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。

クラスメソッド
問題4：クラスメソッド「printCount」を定義してください（データ型：void）

問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください

問題6：クラスメソッド「printCount」を呼び出してください*/

class Person {
	public String name;
	public int age;
	public double height;
	public double weight;
	static int count = 0;

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println();
	}

	public static void printCount() {
		System.out.println("合計" + count + "人です");

	}
};
