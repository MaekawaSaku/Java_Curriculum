package curriculum_B;

public class Qus4 {
	public static void main(String args[]) {
		// 九九の計算
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j > 8) {
					System.out.print(String.format("%02d", i) + " * " +String.format("%02d", j) + " = "
							+String.format("%02d", i*j) );
				}

				else   {
					System.out.print(String.format("%02d", i) + " * " +String.format("%02d", j) + " = "
							+String.format("%02d", i*j) +" || ");
				}
			}
			
			//改行
			System.out.println();
		}
	}
};
