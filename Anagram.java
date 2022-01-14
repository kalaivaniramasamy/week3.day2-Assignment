package week3.day2;

import java.util.Arrays;

public class Anagram {

		public static void main(String[] args) 
		{
			 String inputStr1 = "stops";
			 String inputStr2 = "potss"; 
			 if(inputStr1.length() == inputStr2.length())
			 {
				 System.out.println("both strings are equal");
				 char[] charArray1 = inputStr1.toCharArray();
				 char[] charArray2 = inputStr2.toCharArray();
				 Arrays.parallelSort(charArray1);
				 Arrays.parallelSort(charArray2);

				 if(Arrays.equals(charArray1, charArray2))
					 System.out.println("The two input strings are anagram");
				 else
					 System.out.println("The two input strings are not anagram");
				
			 }
		}

	}