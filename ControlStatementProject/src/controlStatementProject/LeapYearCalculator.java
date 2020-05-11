package controlStatementProject;
import java.util.Scanner;

public class LeapYearCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int bulan = 0;
		int tahun = 0;
		System.out.println("Masukkan Bulan: ");
		bulan = in.nextInt();
		System.out.println("Masukkan Tahun: ");
		tahun = in.nextInt();
		String bulannya = (bulan%2==0)?"Genap":"Ganjil";
		switch (bulan) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Bulan ini ada 31 hari, Bulan ini "+bulannya);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Bulan ini ada 30 hari, Bulan ini "+bulannya);
			break;
		case 2:
			if (tahun%4==0&&tahun%100!=0||tahun%400==0) {
				System.out.println("Tahun ini adalah tahun kabisat, Bulan ini ada 29 hari");
			}
			else {
				System.out.println("Tahun ini adalah bukan tahun kabisat, Bulan ini ada 28 hari");
			}
			System.out.println("Bulan ini "+bulannya);
			break;
		default:
			System.out.println("Inputan anda salah tidak ada bulan ke "+ bulan+ ". Silahkan coba lagi!");
			break;
		}
	}
}
