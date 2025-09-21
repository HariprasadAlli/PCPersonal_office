package restart1.restart1;

import org.testng.annotations.Test;

public class Dummy {

    @Test(expectedExceptions = ArithmeticException.class)
    public void exceptionHandlingTest() {
        int result = 1 / 0;
        System.out.println("This will not print.");
    }
}
