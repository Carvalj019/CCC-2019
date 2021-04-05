import java.util.Scanner;
public class TimeToDecompress 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String array[] = new String[sc.nextInt()];
		sc.nextLine();
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = sc.nextLine();
			array[i] = decompress(array[i]);
		}
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}

	public static String decompress(String s)
	{
		String newS = "";
		for(int i = 0; i < Integer.parseInt(s.substring(0, s.lastIndexOf(" "))); i++)
		{
			newS += s.charAt(s.indexOf(" ") + 1);
		}
		return newS;
		
	}
}
