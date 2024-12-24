

package curriculum_B;

public class Qus5 {
	public static void main(String args[]) {
		// 九九の計算
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 20; j++) {
				if (j > 19) {
					System.out.print(String.format("%03d", j) + " * " +String.format("%03d", i) + " = "
							+String.format("%03d", i*j) );
				}

				else   {
					System.out.print(String.format("%03d", j) + " * " +String.format("%03d", i) + " = "
							+String.format("%03d", i*j) +" || ");
				}
			}
			
			//改行
			System.out.println();
		}
	}
};
