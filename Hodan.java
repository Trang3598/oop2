package BT2;

import java.util.ArrayList;
import java.util.Scanner;

public class Hodan {
	public static void  Nhapdsnguoitrongho(){
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguoi trong ho dan");
		n = sc.nextInt();
 
		ArrayList<People> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			People nguoi = new People();
			System.out.println("Nguoi thu " + (i + 1) + " la :");
			sc.nextLine();

			System.out.println("Ho va ten: ");
			String ten = sc.nextLine();

			System.out.println("Nghe nghiep : ");
			String nghe = sc.nextLine();

			System.out.println("Tuoi : ");
			int tuoi = sc.nextInt();

			System.out.println("Nam sinh : ");
			int namsinh = sc.nextInt();

			nguoi.setTen(ten);
			nguoi.setTuoi(tuoi);
			nguoi.setNamsinh(namsinh);
			nguoi.setNghe(nghe);

			list.add(nguoi);

		}
		System.out.println("Danh sach nguoi cua  ho la : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print("=============");
			System.out.print('\n' + "Ho va ten :" + list.get(i).getTen() + '\n' + "Tuoi : " + list.get(i).getTuoi()
					+ '\n' + "Nam sinh : " + list.get(i).getTuoi() + '\n' + "Nghe nghiep : " + list.get(i).getNghe()
					+ '\n');
		}

	}
}
