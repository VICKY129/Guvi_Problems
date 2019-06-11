import java.util.*;
public class Power_Number {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int s=scan.nextInt();
		float t=(float) Math.pow(n,s);
		int d=(int)t;
		System.out.println(d);

	}

}
