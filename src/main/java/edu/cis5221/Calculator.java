package edu.cis5221;

public class Calculator {

    public static int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public int times(int x, int y) { return (x * y); }

    public int remainder(int x, int y) {
        if (y == 0 ) {
            return (0);
        }
        return x % y; 
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    // Overloaded method
    public static int subtract(String numbers) {
        String[] parts = numbers.split(",");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        return x - y;
    }

    public int times(int[] values) {
        int total = 1;

        for (int value : values) {
            total *= value;
        }

        return total;
    }

    public double divide(int x, int y){
        return x/y;
    }
    

    public int max(int arr[]) {
        int max = arr[0];

        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int average(int[] arr) {
        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        return sum / arr.length;
    }



}
