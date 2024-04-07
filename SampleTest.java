import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {
    
    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 5);
        assertEquals(8, result, "Addition operation failed");
    }
    
    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        double result = calc.divide(10, 2);
        assertEquals(5.0, result, "Division operation failed");
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) dividend / divisor;
    }
}
