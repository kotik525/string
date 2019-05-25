package stringdemo;

public class Suffix {

	public static void main(String[] args) {
		String s1="Yellow Lemon"; 
		String s2="Green Lemon";
		String result=""; 		
		for(int i=s1.length()-1;i>=0;i--){
				if(s1.charAt(i) != s2.charAt(i-1))
					break;
				else {
					result = s1.charAt(i)+result;	
				}
			}
			System.out.println("String:"+" "+s1); 
			System.out.println("String:"+" "+s2);
			System.out.println("common suffix String:" + " " +result);
			

		

	}

}
