package stringdemo;

public class Basic {

	public static void main(String[] args) {
		String s1="0123456789101112";
		String s2=new String(s1.substring(0,12));
		String s3="****";
		System.out.println(s2+s3);
}

}
