import java.util.Scanner;

public class sortArray {

	public static void main(String[] args) {
		// Memanggil method Scanner untuk membaca input
		Scanner userInput = new Scanner(System.in);
		// Deklarasi array dataNum, dan int x
		int[] dataNum = new int[8];
		int x = 1;

		// Menambahkan integer inputan user pada array dataNum
		for (int i = 0; i < 8; i++) {
			System.out.print("Angka ke "+x+" : ");
			dataNum[i] = userInput.nextInt();
			x++;
		}

		// Algoritma buble sort
		int n = dataNum.length;
		for (int i = 0; i < n-1; i++) {
			int min_idx = i;
			for (int j = i+1; j < n; j++) {
				if (dataNum[j] < dataNum[min_idx]) {
					min_idx = j;
				}
			}

			int temp = dataNum[min_idx];
			dataNum[min_idx] = dataNum[i];
			dataNum[i] = temp;
		}

		// Tampilkan hasil algoritma
		System.out.println("-----------------------");
		System.out.println("Hasil sorting");
		System.out.println("-----------------------");
		for (int num : dataNum) {
			System.out.print(num+" ");
		}
		System.out.println("\n-----------------------");
	}
}
