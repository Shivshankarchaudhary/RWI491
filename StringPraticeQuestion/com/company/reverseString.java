package com.company;

public class reverseString {
    public static void main(String[] args) {
        String str="Delhi";
        StringBuilder newStr = new StringBuilder();
        char ch;
        for(int i=str.length()-1; i>=0; i--){
            ch=str.charAt(i);
            newStr.append(ch);
        }
        System.out.print("Reverse String is -> ");
        System.out.println(newStr);
    }
}
