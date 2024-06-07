package com.company;
import java.util.HashMap;
public class countOccurance {
    public static void main(String[] args) {
        String str="Hello";
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            if(mp.containsKey(str.charAt(i))){
                int count=mp.get(str.charAt(i));
                mp.put(str.charAt(i),++count);
            }
            else{
                mp.put(str.charAt(i),1);
            }
        }

        System.out.println(mp);

    }
}
