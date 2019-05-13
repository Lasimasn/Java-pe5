//Program to count the occurance of each word in the string using Hashmap
package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfEachWordInString {
    Scanner scan;
    public static void main(String  args[])
    {
        CountOfEachWordInString count= new CountOfEachWordInString();
        count.countString();//Function to count the occurance of each words in a string
    }
    private void countString()
    {
        String word="one one -one ___two,,three,one @three*one?two";
        System.out.println("Input String:"+word);
        HashMap<String,Integer> stringCount=new HashMap<>();//Creates an object of Hashmap
        String[] strArray=word.split("-|,|_| |@|\\*|\\?");//Converts String to Character Array

        for(String c:strArray)
        {
            if(stringCount.containsKey(c))//Initially Hash map is empty
            {
                stringCount.put(c,stringCount.get(c)+1);//If a string is present already increments count
            }
            else
            {
                stringCount.put(c,1);//If a string is occuring for the first time initialises count to 1
            }
        }
        stringCount.remove("");
        System.out.println(stringCount);
    }

}
