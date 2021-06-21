import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Locale;

public class Strings {
    /* Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
    cannot use additional data structures?*/
    public boolean isHasAllUniqueCharacters( @NotNull String str){
        boolean[] charecters = new boolean[128];
        for (int i = 0;i<str.length();i++){
            if (charecters[str.charAt(i)]== true){
                return false;
            }else {
                charecters[str.charAt(i)]= true;
            }
        }
        return true;
    }
    /*strings, write a method to decide if one is a permutation of the
    other.*/

    public  boolean isAPermutation(String a,String b){
        if(a.length()!= b.length()){
            return false;
        }
        int[] ch = new int[128];
        for (int i =0;i<a.length();i++){
            ch[a.charAt(i)]++;
            ch[b.charAt(i)]--;
        }
        for (int i =0 ;i<128;i++){
            if(ch[i] !=0){
                return  false;
            }
        }
        return true;
    }
    /*Write a method to replace all spaces in a string with '%2e: You may assume that the string
    has sufficient space at the end to hold the additional characters, and that you are given the "true"
    length of the string.*/
    public String replaceSpaces(String str){
        int spaces = 0;
        for (int i = 0; i<str.length();i++){
            if( str.charAt(i) == ' '){
                spaces ++;
            }
        }
        char[] newStr  = new char[str.length()+ spaces*2];
        for (int i = 0, j = i ; i<str.length();i ++ ,j++ ) {
            if (str.charAt(i) == ' ') {
                newStr[j] = '%';
                newStr[j + 1] = '2';
                newStr[j + 2] = '0';
                j += 2;
            } else {
                newStr[j] = str.charAt(i);
            }
        }
        return String.valueOf(newStr);
    }

    /*Palindrome Permutation: Given a string, write a function to check if it is a permutation of
    a palindrome.*/
    public boolean permutationOfPalindrome(String str){
        String newStr = str.toLowerCase();
        int[] table = new int[128];
        boolean valid = true;
        for (int i= 0; i<newStr.length();i++){
            table[newStr.charAt(i)] += 1;
        }
        for (int i= 0; i< table.length ;i++){
            if(table[i] %2 == 1){
                if(!valid){
                    return false;
                }
                valid = false;
            }
        }
        return true;
    }

    /*    One Away: There are three types of edits that can be performed on strings: insert a character,
    remove a character, or replace a character. Given two strings, write a function to check if they are
    one edit (or zero edits) away.*/
    public boolean isOnlyOnEdit(String str1, String str2){
        boolean alreadyChange = false;
        if(Math.abs(str1.length()-str2.length())>1){
            return false;
        }
        for (int i = 0,j=i;i<str1.length()&& j<str2.length();++i,j++){
            if(str1.charAt(i) != str2.charAt(j)){
                if (alreadyChange == true){
                    return false;
                }
                alreadyChange=true;
                if(str1.length()>str2.length()){
                    i++;
                }
                else if (str1.length()<str2.length()){
                    j++;
                }
            }
        }
        return true;
    }

}
