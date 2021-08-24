package com.example.mathTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import utils.toy.math.Pythagorean;

public class PythagoreanTest {

    @Test
    public void pythagoreanBasic(){
        assertEquals(5.0, Pythagorean.hypotenuse(3.0, 4.0));
    }
    
}
