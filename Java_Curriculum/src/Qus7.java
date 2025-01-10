import java.util.Scanner;

public class Qus7 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int number;
		boolean check = false;
		do {
			System.out.print("生徒の人数を入力してください(2以上):");
			number = scan.nextInt();

			if (number > 1) {
				check = true;
			} else {
				System.out.println("人数は2人以上です。");
			}
		} while (!check);
		double studentsScores[] = new double[number];
		double englishScores[] = new double[number];
		double mathScores[] = new double[number];
		double scienceScores[] = new double[number];
		double socialScores[] = new double[number];
		double englishSum = 0;
		double num = 0;
		for (int i = 1; i <= number; i++) {

			System.out.print(i + "人目の『英語』の点数を入力してください:");
			num = scan.nextDouble();
			studentsScores[i - 1] += num;
			//englishScores[i - 1] = num;
			englishSum += num;

			System.out.print(i + "人目の『数学』の点数を入力してください:");
			num = scan.nextDouble();
			studentsScores[i - 1] += num;
			mathScores[i - 1] = num;

			System.out.print(i + "人目の『理科』の点数を入力してください:");
			num = scan.nextDouble();
			studentsScores[i - 1] += num;
			scienceScores[i - 1] = num;

			System.out.print(i + "人目の『社会』の点数を入力してください:");
			num = scan.nextDouble();
			studentsScores[i - 1] += num;
			socialScores[i - 1] = num;
			System.out.println();
		}

		double studentsAve;
		for (int i = 1; i <= number; i++) {
			studentsAve = studentsScores[i - 1] / 4;
			System.out.println(i + "人目の平均点は" + String.format("%.2f", studentsAve) + "点です。");
		}
		System.out.println();

		double englishAve;
		//double englishSum = 0;
		for (int i = 0; i < number; i++) {
			englishSum = englishSum + englishScores[i];
		}
		englishAve = englishSum / number;
		System.out.println("英語の平均点は" + String.format("%.2f", englishAve) + "点です。");

		double mathAve;
		double mathSum = 0;
		for (int i = 0; i < number; i++) {
			mathSum = mathSum + mathScores[i];
		}
		mathAve = mathSum / number;
		System.out.println("数学の平均点は" + String.format("%.2f", mathAve) + "点です。");

		double scienceAve;
		double scienceSum = 0;
		for (int i = 0; i < number; i++) {
			scienceSum = scienceSum + scienceScores[i];
		}
		scienceAve = scienceSum / number;
		System.out.println("理科の平均点は" + String.format("%.2f", scienceAve) + "点です。");

		double socialAve;
		double socialSum = 0;
		for (int i = 0; i < number; i++) {
			socialSum = socialSum + socialScores[i];
		}
		socialAve = socialSum / number;
		System.out.println("社会の平均点は" + String.format("%.2f", socialAve) + "点です。");

		double ave;
		ave = (englishSum + mathSum + scienceSum + socialSum) / 4 / number;
		System.out.println("全体の平均点は" + String.format("%.2f", ave) + "点です。");

		scan.close();
	}
};
