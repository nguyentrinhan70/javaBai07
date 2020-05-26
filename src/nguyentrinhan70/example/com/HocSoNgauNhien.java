package nguyentrinhan70.example.com;

import java.util.Random;

public class HocSoNgauNhien {

	public static void main(String[] args) {

		int a[] = new int[10];
		Random rd = new Random();
		System.out.println("Tạo mảng");
		for (int i=0; i<a.length;i++) {
			a[i] = rd.nextInt(100);
			System.out.print(a[i] +"\t");
		}
		System.out.println();
		//Tạo số ngẫu nhiên trong đoạn[-50, 50]
		//Random rd = new Random();
		System.out.println("Tạo mảng");
		for (int i=0; i<a.length;i++) {
			a[i] = -50+rd.nextInt(101);
			System.out.print(a[i] +"\t");
		}
	}

}
