package com.company;

public class countNumberOfVowels {
    public static void main(String[] args) {
        String str="It is a gOod ApplE";
        int cnt=0;
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') || (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')){
                cnt++;
            }
        }
        System.out.println("Number of vowels in string is "+cnt);
    }
}
