package org.example;

import org.junit.jupiter.api.Test;
import org.example.multifunc;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class functest { ;
    @Test
    public void testMin() throws IOException {
        multifunc multifunc = new multifunc();
        assertEquals(1, multifunc._min(multifunc.readFromFile("test1.txt")));
        assertEquals(-5, multifunc._min(multifunc.readFromFile("test2.txt")));
        assertEquals(0, multifunc._min(multifunc.readFromFile("test3.txt")));
        assertEquals(5, multifunc._min(multifunc.readFromFile("test4.txt")));
        assertEquals(0, multifunc._min(multifunc.readFromFile("test5.txt")));
    }

    @Test
    public void testMax() throws IOException {
        multifunc multifunc = new multifunc();
        assertEquals(10, multifunc._max(multifunc.readFromFile("test1.txt")));
        assertEquals(-1, multifunc._max(multifunc.readFromFile("test2.txt")));
        assertEquals(30, multifunc._max(multifunc.readFromFile("test3.txt")));
        assertEquals(5, multifunc._max(multifunc.readFromFile("test4.txt")));
        assertEquals(3, multifunc._max(multifunc.readFromFile("test5.txt")));
    }
    @Test
    public void testSum() throws IOException {
        multifunc multifunc = new multifunc();
        assertEquals(22, multifunc._sum(multifunc.readFromFile("test1.txt")));
        assertEquals(-15, multifunc._sum(multifunc.readFromFile("test2.txt")));
        assertEquals(75, multifunc._sum(multifunc.readFromFile("test3.txt")));
        assertEquals(5, multifunc._sum(multifunc.readFromFile("test4.txt")));
        assertEquals(6, multifunc._sum(multifunc.readFromFile("test5.txt")));
    }

    @Test
    public void testMultiply() throws IOException {
        multifunc multifunc = new multifunc();
        assertEquals(BigInteger.valueOf(400), multifunc._mult(multifunc.readFromFile("test1.txt")));
        assertEquals(BigInteger.valueOf(-120), multifunc._mult(multifunc.readFromFile("test2.txt")));
        assertEquals(BigInteger.valueOf(0), multifunc._mult(multifunc.readFromFile("test3.txt")));
        assertEquals(BigInteger.valueOf(5), multifunc._mult(multifunc.readFromFile("test4.txt")));
        assertEquals(BigInteger.valueOf(0), multifunc._mult(multifunc.readFromFile("test5.txt")));
    }

    @Test
    public void myTest() throws IOException {
        multifunc multifunc = new multifunc();
        ArrayList<Integer> min_max = new ArrayList<>();
        min_max.add(multifunc._max(multifunc.readFromFile("test1.txt")));
        min_max.add(multifunc._max(multifunc.readFromFile("test2.txt")));
        min_max.add(multifunc._max(multifunc.readFromFile("test3.txt")));
        min_max.add(multifunc._max(multifunc.readFromFile("test4.txt")));
        min_max.add(multifunc._max(multifunc.readFromFile("test5.txt")));
        int[] ans = new int[min_max.size()];
        for (int i = 0; i < min_max.size(); i++) {
            ans[i] = min_max.get(i);
        }
        assertEquals(-1, multifunc._min(ans));
    }
}
//