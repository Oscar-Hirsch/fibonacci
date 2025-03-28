package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 2) +  fibonacci(n - 1);
        }
    }
}

//Rekursion schon mies aber cool wenn klappt



