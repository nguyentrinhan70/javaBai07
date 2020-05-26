package nguyentrinhan70.example.com;
public class HocStringBuilder {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i<1000; i++) {
			buffer.append("Phần tử: "+i);
			buffer.append("\n");
		}
		System.out.println(buffer.toString());
	}
}
