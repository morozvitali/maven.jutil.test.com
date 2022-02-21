import org.junit.Test;

public class TestMyMath {

    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException () {
    MyMath.divide(1, 0);


    }
}
