package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.io.FileNotFoundException;

public class multifunc {
    public static int[] readFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        String[] num = line.split(" ");
        int[] numbers = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            numbers[i] = Integer.parseInt(num[i]);
        }
        return numbers;
    }

    public static int _min(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int _max(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static long _sum(int[] numbers) {
        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static BigInteger _mult(int[] numbers) {
        BigInteger product = BigInteger.ONE;
        for (int number : numbers) {
            product = product.multiply(BigInteger.valueOf(number));
        }
        return product;
    }

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        String filename = "test1.txt";
        int[] numbers = readFromFile(filename);
        System.out.println("Минимальное число: " + _min(numbers));
        System.out.println("Максимальное число: " + _max(numbers));
        System.out.println("Сумма всех чисел: " + _sum(numbers));
        System.out.println("Произведение всех чисел: " + _mult(numbers));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Время выполнения: " + duration +"ms");
    }
}
