package Curriculum_23;

public class Main {
	/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.setName("ライオン");
		lion.setLength("2.1m");
		lion.setSpeed("80km/h");
		System.out.println("動物名:" + lion.getName());
		System.out.println("体長:" + lion.getLength());
		System.out.println("速度:" + lion.getSpeed());
	}

}
