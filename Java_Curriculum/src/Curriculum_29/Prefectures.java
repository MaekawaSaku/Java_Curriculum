package Curriculum_29;

import java.util.Arrays;
import java.util.Collections;

/*
	
0, "北海道:札幌市:83424"
1, "青森県:青森市:9646"
2, "岩手県:盛岡市:15275"
3, "宮城県:仙台市:7282"
4, "秋田県:秋田市:11638"
5, "山形県:山形市:9323"
6, "福島県:福島市:13784"
7, "茨城県:水戸市:6097"
8, "栃木県:宇都宮市:6408"
9, "群馬県:前橋市:6362"
10, "埼玉県:さいたま市:3798"
	
	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8,5,9,.....
	と入力された場合（昇順）
	
	都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
	
	都道府県名：栃木県
県庁所在地：宇都宮市
面積：6408.0km2

	都道府県名：群馬県
県庁所在地：前橋市
面積：6362.0km2

*/
public class Prefectures {

	private String number;
	private String order;

	public Prefectures(String number, String order) {
		this.number = number;
		this.order = order;
		if (number.isEmpty() || number == null) {
			System.exit(0);
		}
	}

	public void order(Integer[] num) {
		if (this.order.equals("昇順")) {
			Arrays.sort(num);
		} else if (this.order.equals("降順")) {
			Arrays.sort(num, Collections.reverseOrder());
		}
	};

	public void display() {

		String[] comma = this.number.split(",");
		Integer[] nums = new Integer[comma.length];
		for (int i = 0; i < comma.length; i++) {

			nums[i] = (Integer.parseInt(comma[i]));
		}
		;
		this.order(nums);

		for (int num : nums) {
			this.display2(num);
		}
		;
	};

	public void display2(int num) {
		if (num >= 11 || 0 > num) {
			return;
		}
		;
		String[] data = { "北海道:札幌市:83424", "青森県:青森市:9646", "岩手県:盛岡市:15275", "宮城県:仙台市:7282", "秋田県:秋田市:11638",
				"山形県:山形市:9323", "福島県:福島市:13784", "茨城県:水戸市:6097", "栃木県:宇都宮市:6408", "群馬県:前橋市:6362", "埼玉県:さいたま市:3798" };
		String[] comma = data[num].split(":");

		System.out.println("都道府県名：" + comma[0]);
		System.out.println("県庁所在地：" + comma[1]);
		System.out.println("面積：" + comma[2] + "km2");
		System.out.println();
	};
};
