
import java.util.HashSet;
import java.util.Scanner;
public class ret{

	public static void main(String a[])
	{
		Scanner q = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<>();
		System.out.print("Enter range:");
		int n = q.nextInt();
		for(int i = 0; i < n; i++)
		{
			hs.add(i * 10);
		}
		System.out.println("Set 1:");
		System.out.println(hs);
		HashSet<Integer> hs2 = new HashSet<>();
		for(int i = 3; i < n; i++)
		{
			hs2.add(i * 10);
		}		
		System.out.println("Set 2:");
		System.out.println(hs2);

		hs.retainAll(hs2);
		System.out.println("After Retaining:");
		System.out.println(hs);
	}
}