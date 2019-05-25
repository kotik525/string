package stringdemo;
 	
public class Stringdeom {

	public static void main(String[] args) {
String s1="javabasis";
String s2="javabasics"; 
char ch=s1.charAt(0);
char ch1=s2.charAt(0);
System.out.println(ch);
System.out.println(s1.compareTo(s2));
System.out.println(s1.length());
System.out.println(s1.compareToIgnoreCase(s2));
System.out.println(s2.endsWith(s1));
System.out.println(s1.endsWith(s1));
System.out.println(s1.matches(s2));
System.out.println(s2.codePointAt(4));
System.out.println(s1.toUpperCase());
System.out.println(s2.toLowerCase());
System.out.println(s1.toUpperCase());

	}

}   
