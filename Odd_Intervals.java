import java.util.*;
public class Odd_Intervals {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int S=scan.nextInt();
		for(int i=N;i<S;i++){
			if(i%2!=0){
				System.out.println(i);
			}
	}

}
}
