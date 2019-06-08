import java.util.*;
public class Sum_Num {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int s=0;
		for(int i=0;i<=n;i++){
			s+=i;
		}
		System.out.println(s);
	}
}
