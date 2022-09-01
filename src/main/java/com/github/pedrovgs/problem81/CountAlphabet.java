
package com.github.pedrovgs.problem81;
import java.util.Random;

public class CountAlphabet
{
	public int countA(String word)
	{
		int count = 0;
		for (int i = 0; i<word.length(); i++)
		{
			if(word.charAt(i)=='a' || word.charAt(i)=='A'){
				count++;
			}
		}
		return count;
	}
     
}




