package com.company;

import java.util.HashMap;

public class removeDuplicates {
    public static void main(String[] args) {
        String str="Heelloo";
        StringBuilder ans = new StringBuilder();
        HashMap<Character,Integer> mp=new HashMap<>();

        for(int i=0; i<str.length(); i++){
            if(!mp.containsKey(str.charAt(i))) {
                ans.append(str.charAt(i));
                mp.put(str.charAt(i), 1);
            }
        }
        System.out.println("After removing duplicates New String -> "+ans);
    }
}
