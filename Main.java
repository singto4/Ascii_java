import java.util.*;

public class Main {
	
	public static void main(String []arge)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter input : ");
		String input = sc.nextLine();
		
		String result = function(input);
		System.out.print(result);
	}

	public static String function(String input)
	{
		char[] text = input.toCharArray();
		int[] number = new int[text.length];
		
		char[] op = {'[', ']', '+', '/', '-', '_', '%', '$'};
		
		String result = "";
		String word = "";
		
		for(int i=0; i<text.length; i++)
		{
			for(char x : op)
			{
				if(text[i] == x)
				{
					result = "Error";
					return result;
				}
			}
		
			int num = (int)text[i];
			number[i] = num + 1;
			
			word = Character.toString((char)number[i]);
			result = result + word;
			
			System.out.print(number[i] + " ");
		}
		
		System.out.println();
		return result;
	}
}
