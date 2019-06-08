import java.util.*;
public class Leap_Year {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%4==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
