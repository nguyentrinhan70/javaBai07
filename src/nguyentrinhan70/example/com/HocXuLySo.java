package nguyentrinhan70.example.com;

import java.text.DecimalFormat;

public class HocXuLySo {

	public static void main(String[] args) {

		int n= 25;
		System.out.println("Căn bậc 2 của 25 là: "+Math.sqrt(25));
		int x =8;
		int y =3;
		System.out.println("8 ^3 = " + Math.pow(x, y));
		int k=-113;
		System.out.println("Số tuyệt đối của: -k là: " + Math.abs(k));
		
		int bankinh=5;
		double cv = 2*Math.PI*bankinh;
		double dt = Math.PI*Math.pow(bankinh, 2);
		System.out.println("Chu vi hình tròn là: " + cv + " Diện tích: "+ dt);
		
		DecimalFormat decimalFormat = new DecimalFormat("##.##");
		System.out.println("Chu vi: "+ decimalFormat.format(cv));
		System.out.println("Diện tích: "+ decimalFormat.format(dt));
		
		int goc = 45;
		double radGoc=Math.PI*goc/180;
		System.out.println("Sin("+goc+") = "+Math.sin(radGoc));
		System.out.println("Sin("+goc+") = "+decimalFormat.format(Math.sin(radGoc)));
		System.out.println("Cos("+goc+") = "+Math.cos(radGoc));
		System.out.println("Cos("+goc+") = "+decimalFormat.format(Math.sin(radGoc)));
		System.out.println("Tan("+goc+") = "+Math.tan(radGoc));
		System.out.println("Tan("+goc+") = "+decimalFormat.format(Math.tan(radGoc)));
		System.out.println("Costan("+goc+") ="+(1/Math.tan(radGoc)));
		System.out.println("Costan("+goc+") ="+decimalFormat.format((1/Math.tan(radGoc))));
		
	}

}
