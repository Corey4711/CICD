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
        assertEquals(20,calc.multiply(5,4));
    }
    @Test
    void multiplyFail(){
        assertNotEquals(3,calc.multiply(5,4));
    }
    @Test
    void subSuccess(){
        assertEquals(1,calc.sub(5,4));
    }
    @Test
    void subFail(){
        assertNotEquals(3,calc.sub(5,4));
    }
    @Test
    void divideSuccess(){
        assertEquals(5,calc.divide(10,2));
    }
    @Test
    void divideFail(){
        assertNotEquals(3,calc.divide(10,2));
    }


}