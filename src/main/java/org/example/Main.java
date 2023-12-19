package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 122) {
                length ++;
            } else {
                length = 0;
                System.out.println(length);

                return;
            }
        }

        System.out.println(length);

    }
}