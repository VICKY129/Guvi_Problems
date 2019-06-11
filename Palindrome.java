import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String N=scan.nextLine();
		StringBuffer str=new StringBuffer(N);
		str.reverse();
		String s=str.toString();
		if(s.equals(N)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}
