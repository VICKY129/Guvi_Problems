import java.util.*;
public class Prime_num {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				count++;
				break;
			}
		
		}
		if(count==0){
			System.out.println("Yes");
		}else{
			System.out.println("no");
		}
}
}
