import java.util.*;
public class Alphabet_Not {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		if((ch>=65 && ch<=97)||(ch>=90 &&ch<=122)){
			System.out.println("Alphabet");
		}else{
			System.out.println("No");
		}
	}
}
