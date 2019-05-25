package stringdemo;

//import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		String str="madam";
		String rev="";
		//System.out.println("Enter a String:");
		//str=sc.nextLine();
		//int length=str.length();
		for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
		}if(str.equals(rev))
			System.out.println(str+" is a palindrome");
			else
			System.out.println(str+" is not a palindrome");
		
	}

}
