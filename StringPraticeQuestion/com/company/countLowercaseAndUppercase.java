package com.company;

public class countLowercaseAndUppercase {
    public static void main(String[] args) {
        String str="BeAuTIfuL";
        int lower=0;
        int upper=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                upper++;
            }
            else{
                lower++;
            }
        }
        System.out.println("Number of UpperCase Latter is "+upper);
        System.out.println("Number of Lowercse Latter is "+lower);
    }
}
