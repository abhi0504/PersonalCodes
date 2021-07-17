
public class bitMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary = "01011011";
		int decimal = Integer.parseInt(binary, 2);
		
		String bi = Integer.toBinaryString(decimal);
		
		System.out.println(decimal);//91
		System.out.println(bi);//1011011
	}

}
