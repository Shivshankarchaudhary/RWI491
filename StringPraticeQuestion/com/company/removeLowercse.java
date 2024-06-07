package com.company;

public class removeLowercse {
    public static void main(String[] args) {
        String str="WelCoCMeM";
        StringBuilder ans=new StringBuilder();


        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                continue;
            }
            else{
                ans.append(str.charAt(i));
            }
        }
        System.out.println(ans);


    }
}
