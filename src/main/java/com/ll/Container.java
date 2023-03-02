package com.ll;

import java.util.Scanner;

public class Container {
    private final static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static Scanner getScanner() {
        return scanner;
    }
}
