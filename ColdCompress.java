import java.util.Scanner;
public class ColdCompress 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String array[] = new String[sc.nextInt()];
		sc.nextLine();
		for(int i = 0; i < array.length; i++)
		{
			array[i] = sc.nextLine();
			array[i] = compress(array[i]);

		}
		sc.close();
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}

	}//End Main

	public static String compress(String sentence)
	{

		String comp = "";
		String acc = "";


		for(int i = 0; i < sentence.length(); )
		{
			acc += sentence.substring(i, lastIndex(sentence, i) + 1);
			comp += acc.length() + " " + acc.charAt(0) + " ";

			acc = "";
			i = lastIndex(sentence, i) + 1;  
		}
		return comp;
	}

	public static int lastIndex(String sentence, int key)
	{
		for(int i = key + 1; i < sentence.length(); i++)
		{
			if(sentence.charAt(key) != sentence.charAt(i))
			{
				return i-1;
			}
		}
		return sentence.length() - 1;
	}
}//End Class