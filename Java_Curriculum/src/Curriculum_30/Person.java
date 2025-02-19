package Curriculum_30;

public class Person {
	//問題1：インスタンスフィールドを定義してください

	//フィールド名	データ型
	//name	string
	//age	int
	//height	double

	String name;
	int age;
	double height;
	double weight;
	
	 static int counter = 0;
	//問題2：コンストラクタを定義してください（下記それぞれの引数）

	//name,age,height

	//問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
	public Person(String name, int age, double height,double weight) {
		this.name = "鈴木太郎";
		this.age = 20;
		this.height = 1.7;
		this.weight = 60.;
		 counter++;
	};

	//インスタンスメソッド
	//問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	
		

		//問題5：Main.javaの引数にweightの60を入れてください
		
	//問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	double bmi;
	//問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
	public double bmi() {
		 return bmi =((Math.floor(this.weight/this.height/this.height)));
	}
	//問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	public void print() {
		
	
	//問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
		System.out.println();
		System.out.println("名前は"+name+"です");
		System.out.println("年は"+age+"才です");
		System.out.println("BMIは"+bmi()+"です");
		System.out.println();
		
	
	//問題10：人数の合計を「合計○人です」と出力してください。
		System.out.println("合計"+counter+"人です");
	}
}
