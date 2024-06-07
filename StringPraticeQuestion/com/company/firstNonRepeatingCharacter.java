package com.company;

import java.util.HashMap;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str="hello";
        HashMap<Character,Integer>mp=new HashMap<>();

        for(int i=0; i<str.length(); i++){
            mp.put(str.charAt(i), mp.getOrDefault(str.charAt(i), 0) + 1);
        }

        char ans=' ';
        for(int i=0; i<str.length(); i++){
            if(mp.get(str.charAt(i))==1) {
                ans = str.charAt(i);
                break;
            }
        }
        if(ans==' '){
            System.out.println("There is Not non repeating character");
        }
        else {
            System.out.println("first non repeating character is -> "+ans);
        }

    }
}
