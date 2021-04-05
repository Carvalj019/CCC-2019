import java.util.Scanner;
public class WinningScores 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int apples = 0, bananas = 0;
		apples += (sc.nextInt()) * 3;
		apples += (sc.nextInt()) * 2;
		apples += (sc.nextInt());
		bananas += (sc.nextInt()) * 3;
		bananas += (sc.nextInt()) * 2;
		bananas += sc.nextInt();
		
		if(apples > bananas)
		{
			System.out.println("A");
		}
		else if(bananas > apples)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("T");
		}
	}//End Main
}//End Class