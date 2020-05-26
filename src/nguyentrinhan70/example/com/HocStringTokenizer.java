package nguyentrinhan70.example.com;

import java.util.StringTokenizer;

public class HocStringTokenizer {

	public static void main(String[] args) {

		String s ="Hoc   , hoc   , hoc nữa  ,   hoc mãi";
		//Mặc định StringTokenizer tách theo ký tự trắng
		StringTokenizer stringTokenizer =new StringTokenizer(s);
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
		System.out.println("===============================");
		//Tách theo dấu ","
		StringTokenizer stringTokenizer2 = new StringTokenizer(s,",");
		while(stringTokenizer2.hasMoreTokens()) {
			System.out.println(stringTokenizer2.nextToken());
		}
		System.out.println("==============================");
		//Tách theo dấu "," và khoảng trắng
		StringTokenizer stringTokenizer3 = new StringTokenizer(s,", ");
		while(stringTokenizer3.hasMoreTokens()) {
			System.out.println(stringTokenizer3.nextToken());
		}
	}

}
