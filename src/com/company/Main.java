package com.company;

public class Main {

    public static void main(String[] args) {

        String str= "Radar", str2="xox", str3="Hi";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));


    }

    public static String isPalindrome(String str){
        String reverseStr = "";
        String result="";

        //int strLength = str.length();

        for (int i = str.length() - 1; i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
             result="Yes";
        }
        else {
            result= "No";
        }
    return result;}
}



