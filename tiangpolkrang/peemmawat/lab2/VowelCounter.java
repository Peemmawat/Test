package tiangpolkrang.peemmawat.lab2;

/**
* This VowelCounter program is to accept only one arguments include "word" 
* to extract the vowels from the words we entered.
* Author: Peemmawat Tiangpolkrang
* ID: 563040565-0
* Sec: 1
* Date: December 25, 2019
*
**/

public class VowelCounter {
  public static void main(String[] args)
    {
        String word = args[0];

        System.out.print("Total number of vowels is : " + count_Vowels(word)+"\n");
    }
 public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}