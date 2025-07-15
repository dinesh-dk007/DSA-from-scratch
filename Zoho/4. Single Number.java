import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		int result = 0;
		for(int i = 0;i<n;i++){
		    arr[i] = s.nextInt();
		    result ^= arr[i];
		}
		System.out.print(result);
	}
}