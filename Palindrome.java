package week3.day2;

public class Palindrome {

		public static void main(String[] args) 
		{
			String input = "madam";
			String output = "";
			for(int i=input.length()-1; i>=0;i--)
			{
				output = output + input.charAt(i);
			}
			if(input.equals(output))
				System.out.println("The string is a palindrome");
			else
				System.out.println("The string is not a palindrome");
		}

	}

