import java.util.Scanner;
public class Flipper 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int array[][] =  {{1,2},
				         {3,4}};
		
		String input = sc.nextLine();
		sc.close();
		
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) == 'H')
			{
				horFlip(array);
			}
			else
			{
				verFlip(array);
			}
		}
		
		System.out.println(array[0][0] + " " + array[0][1]);
		System.out.println(array[1][0] + " " + array[1][1]);
	}
	
	public static void horFlip(int array[][])
	{
		int temp[] = array[0];
		array[0] = array[1];
		array[1] = temp;
	}
	
	public static void verFlip(int array[][])
	{
		int temp = array[0][0];
		array[0][0] = array[0][1];
		array[0][1] = temp;
		temp = array[1][0];
		array[1][0] = array[1][1];
		array[1][1] = temp;
	}

}
