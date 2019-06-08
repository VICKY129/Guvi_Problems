import java.util.*;
public class Vowel_Consonant {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char ch1[]=str.toCharArray();
		String v="",c="",n="";
		for(int i=0;i<ch1.length;i++){
		if(ch1[i]=='a' || ch1[i]=='e' || ch1[i]=='i' || ch1[i]=='o'||ch1[i]=='u'){
			v+=String.valueOf(ch1[i]);
			System.out.println("Vowel");
		}
		else if(Character.isAlphabetic(ch1[i])&&(!Character.isDigit(ch1[i]))){
			c+=String.valueOf(ch1[i]);
			System.out.println("Consonant");
		}
		else{
			System.out.println("Invalid");
		}
	}
	}

}
