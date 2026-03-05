package edu.cis5221;

public class Calculator {

    public static int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public int remainder(int x, int y) {
        if (y == 0 ) {
            return (0);
        }
        return x % y; 
    }
    
    public int subtract(int x, int y) {
        return x - y;
    }

}
