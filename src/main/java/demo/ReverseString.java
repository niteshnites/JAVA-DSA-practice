package demo;

import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args){

        String str, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        str = sc.nextLine();

        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reverse String is: "+ reverse);
    }
}
