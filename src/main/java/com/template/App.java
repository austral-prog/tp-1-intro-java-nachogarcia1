package com.template;


public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        return a + b;
    }
    // 2. Check Even or Odd
    public boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
        }
        return false;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        if (a>b){
            return a;
        }
        return b;
    }
    // 4. Factorial of a Number
    public int factorial(int n) {
        if (n ==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        int len = input.length();
        return len;
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String revstr = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            revstr += input.charAt(i);

        }
    return revstr;
    }
    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number <= 1){
            return false;
        }
        if (number == 2){
            return true;
        }
        if (number % 2 == 0){
            return false;
        }
        for (int i = 3; i*i <= number; i+=2){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int num = 9999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < num){
                num = array[i];
            }
        }
        return num;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num += array[i];
        }
        return num;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double newtempf = (1.8 * celsius )+ 32;
        return newtempf;
    }
}
