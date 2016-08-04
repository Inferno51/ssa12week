package com.tiy.ssa.weekone.day4.prework;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author thurston
 */
public class Scratch 
{
    final String english;
    public Scratch(String english)
    {
        this.english = english;
    }
    
    
    public String translate()
    {
        final String[] words = this.english.split("\\W");
        String collect = Arrays.stream(words).map(word -> 
        {
            int length = word.length();
            if (length == 1)
            {
                if (Scratch.isVowel(word.charAt(0)))
                    return word + "way";
                return word;
            }
            
            String firstTwo = word.substring(0, 2);
            char first = firstTwo.charAt(0);
            if (Scratch.isVowel(first))
                return word + "way";
            else if (Scratch.isVowel(firstTwo.charAt(1)))
                return word.substring(1) + first + "ay";
            return word.substring(2) + firstTwo + "ay";
        }).collect(Collectors.joining(" "));
        return collect;
    }
    
    static boolean isVowel(char letter)
    {
        switch (Character.toUpperCase(letter))
        {
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                return true;
            default :
                return false;
        }
    }
}

