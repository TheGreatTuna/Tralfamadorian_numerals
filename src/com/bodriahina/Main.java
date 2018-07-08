package com.bodriahina;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("input");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        while (!isValid(input)){
            System.out.println("Not valid data. Try again");
            System.out.println("input");
            input = in.next();
        }
        System.out.println("output");
        System.out.println(Tralfamadorian.convertToLong(input));
    }

    public static boolean isValid(String input){
        return Pattern.compile("([αβγδεζηθι](\\||\\+x*|\\+\\+x*|x+))+")
                .matcher(input)
                .matches();
    }
}
