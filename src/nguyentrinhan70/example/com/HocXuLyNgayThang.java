package nguyentrinhan70.example.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HocXuLyNgayThang {

	public static void main(String[] args) {

		Calendar calendar =  Calendar.getInstance();
		int nam = calendar.get(Calendar.YEAR);
		System.out.println("Năm nay là: " + nam);
		int thang = calendar.get(Calendar.MONTH);
		System.out.println("Tháng này là: "+(thang+1));
		int ngay = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("Hôm nay là ngày: "+ngay);
		//Sử dụng hàm Simpledate Format
		Date t = calendar.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Hôm này là ngày: " + dateFormat.format(t));
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("d/M/yyyy");
		System.out.println("Hôm này là ngày: " + dateFormat2.format(t));
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Hôm nay là: "+ dateFormat3.format(t));
		
		SimpleDateFormat dateFormat4 = new SimpleDateFormat("hh:mm:ss aaa");
		System.out.println("Bây giờ là: "+ dateFormat4.format(t));
	}

}
