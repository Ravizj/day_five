package Day1Problems;

import java.util.Scanner;

public class StringCompair {
    public static void StrCompare(){
        Scanner Str=new Scanner(System.in);
        System.out.println("Enter First String");
       String s1= Str.next();
        System.out.println("Enter Second String");
       String s2= Str.next();
       if (s1.equals(s2)){
           System.out.println("String is equal");
       }else
           System.out.println("String is not equal");
        System.out.println(s1.equals(s2));
    }
    public static void main(String[] args) {
        StrCompare();

    }
}
