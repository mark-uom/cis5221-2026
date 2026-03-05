package edu.cis5221;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
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

    public int times(int[] values) {
        int total = 1;

        for (int value : values) {
            total *= value;
        }

        return total;
    }

}
