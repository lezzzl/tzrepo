package org.example;

import org.junit.jupiter.api.Test;
import org.example.multifunc;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static java.time.Duration.ofSeconds;

public class speedtest {
    @Test
    public void testMin1() throws IOException {
        long startTime = System.currentTimeMillis();
        int min = multifunc._min(multifunc.readFromFile("speedtest1.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for _min1: " + (endTime - startTime) + " ms");
    }

    @Test
    public void testMin2() throws IOException {
        long startTime = System.currentTimeMillis();
        int min = multifunc._min(multifunc.readFromFile("speedtest2.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for _min2: " + (endTime - startTime) + " ms");
    }
    @Test
    public void testMin3() throws IOException {
        long startTime = System.currentTimeMillis();
        int min = multifunc._min(multifunc.readFromFile("speedtest3.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for _min3: " + (endTime - startTime) + " ms");
    }
    @Test
    public void testMax1() throws IOException {
        long startTime = System.currentTimeMillis();
        int max = multifunc._max(multifunc.readFromFile("speedtest1.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for _max1: " + (endTime - startTime) + " ms");
    }

    @Test
    public void testMax2() throws IOException {
        long startTime = System.currentTimeMillis();
        int max = multifunc._max(multifunc.readFromFile("speedtest2.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for _max2: " + (endTime - startTime) + " ms");
    }
    @Test
    public void testMax3() throws IOException {
        long startTime = System.currentTimeMillis();
        int max = multifunc._max(multifunc.readFromFile("speedtest3.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for _max3: " + (endTime - startTime) + " ms");
    }
    @Test
    public void testSum1() throws IOException {
        long startTime = System.currentTimeMillis();
        long sum = multifunc._sum(multifunc.readFromFile("speedtest1.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for _sum1: " + (endTime - startTime) + " ms");
    }

    @Test
    public void testSum2() throws IOException {
        long startTime = System.currentTimeMillis();
        long sum = multifunc._sum(multifunc.readFromFile("speedtest2.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for _sum2: " + (endTime - startTime) + " ms");
    }
    @Test
    public void testSum3() throws IOException {
        long startTime = System.currentTimeMillis();
        long sum = multifunc._sum(multifunc.readFromFile("speedtest3.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for _sum3: " + (endTime - startTime) + " ms");
    }
    @Test
    public void testMult1() throws IOException {
        long startTime = System.currentTimeMillis();
        BigInteger sum = multifunc._mult(multifunc.readFromFile("speedtest1.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for _mult1: " + (endTime - startTime) + " ms");
    }

    @Test
    public void testMult2() throws IOException {
        long startTime = System.currentTimeMillis();
        BigInteger sum = multifunc._mult(multifunc.readFromFile("speedtest2.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for _mult2: " + (endTime - startTime) + " ms");
    }
    @Test
    public void testMult3() throws IOException {
        long startTime = System.currentTimeMillis();
        BigInteger sum = multifunc._mult(multifunc.readFromFile("speedtest3.txt"));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for _mult3: " + (endTime - startTime) + " ms");
    }
}
