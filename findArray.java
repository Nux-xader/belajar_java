import java.util.Scanner;

public class findArray {

	public static void main(String[] args){
		// Memanggil method Scanner untuk membaca input
		Scanner userInput = new Scanner(System.in);
		// Deklarasi array dataNum, dan int x
		int[] dataNum = new int[10];
		int x = 1;

		// Menambahkan integer inputan user pada array dataNum
		for (int i = 0; i < 10; i++) {
			System.out.print("Angka ke "+x+" : ");
			dataNum[i] = userInput.nextInt();
			x++;
		}

		System.out.println("----------------------------------------");
		// Deklarasi var int index dan status
		int index = 0;
		int status = 0;
		for (int num : dataNum) {
			if (num == 8) {
				status++;
				System.out.println("Angka 8 terdapat pada array indeks ke "+index);
			}
			index++;
		}

		// Mengecek apakah angka 8 telah di temukan atau tidak
		if (status == 0) {
			System.out.println("Angka 8 tidak terdapat pada array");
		}

	}
}