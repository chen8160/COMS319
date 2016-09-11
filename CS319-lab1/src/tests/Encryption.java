package tests;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lseq = "0011111111101111111111111100101101111100110000001011111000010100";
		String tseq = "0011111111100000110011001100110011001100110011001100110011001100";
		
		String s = "abcd";
		char key = 0b1111000011110000;

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < s.length(); i++)
		    sb.append((char) (s.charAt(i) ^ key));

		String result = sb.toString();
		System.out.println("Encrypted: " + result);
		
		sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++)
		    sb.append((char) (result.charAt(i) ^ key));
		result = sb.toString();
		System.out.println("Decrypted: " + result);
	}
	
	

}
