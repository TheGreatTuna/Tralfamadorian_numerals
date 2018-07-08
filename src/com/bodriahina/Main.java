package com.bodriahina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("input");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println("output");
        System.out.println(Tralfamadorian.convertToLong(input));
    }
}
