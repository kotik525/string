package stringdemo;

public class StringReverse {
	public static void main(String[] args) {
		String str= "my name is pawana";
		int length=str.length();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
		//	reverse = reverse + str.charAt(i);
		}
		System.out.println("string reverse is : " +reverse);
	}

}
