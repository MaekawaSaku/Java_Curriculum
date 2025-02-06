package curriculum20_22_process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Curriculum_New_1_20_22_process {

	String country;
	String sushi;
	String food;

	public Curriculum_New_1_20_22_process(String country) {
		this.country = country;
		if (country.equals("日本")) {
			this.sushi = "寿司";
			this.food = "和食";

		} else if (country.equals("中国")) {
			this.sushi = "ラーメン";
			this.food = "中華";
		}

	}

	public Curriculum_New_1_20_22_process() {
		this.country = "日本";
		this.sushi = "寿司";
		this.food = "和食";
	}

	public void hello() {
		System.out.println("こんにちは！ここは" + country + "です！");
	}

	public void hello2() {
		System.out.println("この" + sushi + "はうまい");
	}

	public void hello3() {
		System.out.println(sushi + "は" + food + "です");
	}

	public void hello4() {
		LocalDateTime nowDate = LocalDateTime.now();

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String formatNowDate = dtf1.format(nowDate);

		System.out.println("今の現在日時は" + formatNowDate + "です");
	}

};
