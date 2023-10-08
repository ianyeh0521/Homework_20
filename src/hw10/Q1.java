package hw10;

public class Q1 {

	public static void main(String[] args) {
		int[] ranNums = new int[5];

		for (int i = 0; i < ranNums.length; i++) {
			ranNums[i] = (int) (Math.random() * 100 + 1);
		}

		for (int i = 0; i < ranNums.length; i++) {
			int tempCount = 0;
			int tempNum = ranNums[i];

			if (ranNums[i] == 1) {
				System.out.println(ranNums[i] + "不是質數");
			} else {
				for (int j = 2; j < tempNum; j++) {
					if (ranNums[i] % j == 0) {
						break;
					} else {
						tempCount += 1;
					}
				}

				if (tempCount == (ranNums[i] - 2)) {
					System.out.println(ranNums[i] + "是質數");
				} else {
					System.out.println(ranNums[i] + "不是質數");
				}
			}

		}
	}
}
