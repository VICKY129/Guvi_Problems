import java.util.*;
public class Sum_Integer {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int s=0;
		int N=scan.nextInt();
		int K=scan.nextInt();
		int []arr1=new int[N];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=scan.nextInt();
		}
		for(int i=0;i<K;i++){
			s+=arr1[i];
		}
		System.out.println(s);
	}
}
