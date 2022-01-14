package week3.day2;

public class CharOccurance {
	
	public static void main(String[] args) 
	{
		String inputString = "welcome to chennai";

		char[] charArray = inputString.toCharArray();

		int count = 0;

		for (int i = 0; i < charArray.length; i++) 
		{
			if('e' == charArray[i])
				count++;
		}

		System.out.println("The number of occurances'e' in the string is "+count);
	}

}
