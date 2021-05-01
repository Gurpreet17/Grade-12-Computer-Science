
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary = "000101010100010101000101010101010010101000001010"; 
		int binaryLength = binary.length();
		int binaryDecimal=0;
		char ascii =0;
		
		while ((binaryLength%8)!=0) {
			String binaryAdd = "0" + binary;
			binary = binaryAdd;
			binaryLength = binary.length();
		}
		System.out.println("Decimal: \t ASCII value");
		for (int x=0, y=8; y<=binaryLength-1; x=x+8, y=y+8) {
			binaryDecimal = Integer.parseInt((binary.substring(x,y+1)),2)/2;
			ascii = (char) binaryDecimal;
			System.out.println(binaryDecimal + " \t\t " + ascii);
		}



	}

}
