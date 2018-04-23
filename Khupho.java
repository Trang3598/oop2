package BT2;

import java.util.Scanner;

public class Khupho extends People {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m;
		System.out.println("Nhap so ho dan ");
		m = sc.nextInt();

		for (int i = 0; i < m; i++) {

			System.out.println("Ho thu " + (i + 1) + " la :");

			System.out.println("Nhap so nha cua ho dan");
			int sonha = sc.nextInt();

			Hodan.Nhapdsnguoitrongho();

		}
	}
}
