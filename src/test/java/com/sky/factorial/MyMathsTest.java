package com.sky.factorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MyMathsTest {

    @Test
    void testKnownFactorial(){
        assertEquals("5",MyMaths.verboseFindFactorial(120));
    }

    @Test
    void testNonFactorial(){
        assertEquals("NONE", MyMaths.verboseFindFactorial(150));
    }

    @Test
    void edgeCase0(){
        assertEquals("NONE", MyMaths.verboseFindFactorial(0));
    }

    @Test
    void edgeCase1(){
        assertEquals("1", MyMaths.verboseFindFactorial(1));
    }

}
