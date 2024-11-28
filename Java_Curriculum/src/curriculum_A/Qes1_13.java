package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// 1.ローカル変数として宣言
		
		byte by; //バイト型
				
		short sh; //短整数型
		int in; //整数型
		long lo; //長整数型
				
		float fl; //単精度浮動小数点数型
		double dou; //倍精度浮動小数点数型
		
		char ch; //文字型
		String str; //文字列型
		
		boolean bo;//ブーリアン型
				
		//2.それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
				
		 by = 0 ;
		 
		 sh = 0 ;
		 in = 0 ;
		 lo = 0 ;
		
		 fl = 0.0f ;
		 dou = 0.0 ;
		
		ch = '\u0000' ;
		str = null ;
		
		bo = false ;

		/*3.初期化をしたそれぞれの変数に下記の値を代入してください
		 * 初期化をしたそれぞれの変数に下記の値を代入してください				
		 * ・バイト型		10		
		 * ・短整数型		100		
		 * ・整数型		1000		
		 * ・長整数型		10000		
		 * ・単精度浮動小数点数型		9.5		
		 * ・倍精度浮動小数点数型		10.5		
		 * ・文字型		a		
		 * ・文字列型		ハロー		
		 * ・ブーリアン型		true		*/
		
		by = 10 ;
		
		sh = 100 ;
		in = 1000 ;
		lo = 10000 ;
		
		fl = 9.5f ;
		dou = 10.5 ; 
		
		ch = 'a' ;
		str = "ハロー" ;
		
		bo = true ;
		
		/*4.下記の通りにコンソール出力されるようにしてください上記で作成した変数を必ず使用すること
		 * 11110		11110		
		 * 20		20		
		 * a ハロー true		a ハロー true		
		 * 11130		11130	数字を全て足す	
		 * 10000000000		10000000000	小数点以外の数字を全てかける	
		 * 0.105		0.105	10.5割る100をする	
		 * -90		-90	10引く100をする			
		 */
		
		System.out.println(by+sh+in+lo);
		System.out.println(by+by);
		System.out.println(ch+" "+str+" "+bo);
		System.out.println(Math.round(by+sh+in+lo+fl+dou));
		System.out.println(by*sh*in*lo);
		System.out.println(dou/sh);
		System.out.println(by-sh);
		
		/*5.次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。									
		 * 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。									
		 */
		 String num="20";									
		 int num1=23;		
		 int numStr = Integer.parseInt(num);
		 System.out.println("ハローJAVA"+(numStr+num1));	
		
		
		/*6.『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 * ローカル変数に代入し○○に入れてください
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』*/
		 String name = "山田太郎";
		 int age = 18;
		 double height = 170.5 ;
		 double whight = 62.2 ;
		 String food = "寿司";
		 
		 System.out.println("「初めまして"+name+"です」");
		 System.out.println("「年齢は"+age+"歳です」");
		 System.out.println("「身長は"+height+"cmです」");
		 System.out.println("「体重は"+whight+"kgです」");
		 System.out.println("「好きな食べ物は"+food+"です」");
		 
		/*7.6で作成した自己紹介に続いてBMIが出力されるようにしてください					
		 * 「BMIは○○です」					
		 * ただし計算は数値を直書きせず、全て変数を使ってすること					*/
		 
		 double bmi =((Math.floor((whight/(height/100)/(height/100)) * 10)) / 10);
		 System.out.println("「BMIは"+bmi+"です」");
		 
		 /*8/6"で宣言した変数に再代入し下記の通りコンソールに出力してください"
		  *初めまして鈴木一郎です	
		  *年齢は24歳です	
		  *身長168.5cmです	
		  *体重は64.2kgです	
		  *好きな食べ物はオムライスです	
		  *BMIは22.6です	 
		  * */
		 name = "鈴木一郎";
		 age = 24;
		 height = 168.5 ;
		 whight = 64.2 ;
		 food = "オムライス";
		 bmi =((Math.floor((whight/(height/100)/(height/100)) * 10)) / 10);
		 
		 System.out.println("「初めまして"+name+"です」");
		 System.out.println("「年齢は"+age+"歳です」");
		 System.out.println("「身長は"+height+"cmです」");
		 System.out.println("「体重は"+whight+"kgです」");
		 System.out.println("「好きな食べ物は"+food+"です」");
		 System.out.println("「BMIは"+bmi+"です」");
		 
		 /*9.8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		  * 初めまして鈴木一郎です
		  * 年齢は48歳です
		  * 身長337.0cmです
		  * 体重は128.4kgです
		  * 好きな食べ物はオムライスです
		  * BMIは11.31です*/
		 
		 age= age+age;
		 height = height+height;
		 whight = whight+whight;
		 bmi =((Math.floor((whight/(height/100)/(height/100)) * 100)) / 100);
		 
		 System.out.println("「初めまして"+name+"です」");
		 System.out.println("「年齢は"+age+"歳です」");
		 System.out.println("「身長は"+height+"cmです」");
		 System.out.println("「体重は"+whight+"kgです」");
		 System.out.println("「好きな食べ物は"+food+"です」");
		 System.out.println("「BMIは"+bmi+"です」");
		 
		 /*10.8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません*/
		 
		 age = 24;
		 System.out.println(age >= 25); // true
		 
		 /*11.8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください*/
		 String ageString = String.valueOf(age);
		 String heightString = String.valueOf(height);
		 String whightString = String.valueOf(whight);
		 
		 System.out.println("【"+ageString+"・"+heightString+"・"+whightString+"】");
		 
		 //12.11で変換した【年齢・身長】を整数型に変換して出力してください
		 
		 int ageInt = Integer.parseInt(ageString);
		 double heightDouble = Double.parseDouble(heightString);
		 int heightInt = (int)heightDouble;
		 
		 System.out.println("【"+ageInt+"・"+heightInt+"】");
		 
		 //12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		 System.out.println(ageInt == 25 || heightInt>= 160); // true
		 
		 
}
}