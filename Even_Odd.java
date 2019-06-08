import java.util.*;
public class Even_Odd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%2==0){
			System.out.println("Even");
		}
		else if(n%2!=0){
			System.out.println("Odd");
		}
	}
}
