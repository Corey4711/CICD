package ie.atu.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc calc;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calc = new Calc();
    }

    @Test
    void addSuccess(){
        assertEquals(9,calc.add(5,4));
    }
    @Test
    void addFail(){
        assertNotEquals(3,calc.add(5,4));
    }
    @Test
    void multiplySuccess(){
        assertEquals(20,calc.Multiply(5,4));
    }
    @Test
    void multiplyFail(){
        assertNotEquals(3,calc.Multiply(5,4));
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}