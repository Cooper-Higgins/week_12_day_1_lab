import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addTwoIntegers(){
        assertEquals(10, calculator.addIntegers(7, 3));
    }

    @Test
    public void subtractTwoIntegers(){
        assertEquals(4, calculator.subtractIntegers(7, 3));
    }

    @Test
    public void mulitplyTwoIntegers(){
        assertEquals(21, calculator.multiplyIntegers(7, 3));
    }

    @Test
    public void divideTwoIntegers(){
        assertEquals(2.5, calculator.divideIntegers(5, 2), 0.0);
    }
}
