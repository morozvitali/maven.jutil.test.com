import org.junit.*;

public class MyMathTest {
    static final double DELTA = 1e-9;
    static public MyMath2 mm;

    @BeforeClass
    public static void beforeTest() {
        mm = new MyMath2();
    }

    @After
    public void afterTest() {
        System.out.println("Test ok");
    }


    @Test
    public void resultShouldBeZero() {
        Assert.assertEquals(0, mm.mySum(0, 0), DELTA);
    }

    @Test
    public void xShouldBeZero() {
        Assert.assertEquals(0, mm.getX(), DELTA);
    }

    @Test
    public void yShouldBeZero() {
        Assert.assertEquals(0, mm.getY(), DELTA);
    }

    @Test(timeout = 1000)
    public void resultShouldBefasterTousenSec() {
        mm.mySum(3, 4);
    }

    @Test(expected = ArithmeticException.class)
    public void resultShouldBeDividedByZero() {
        mm.myDivide(0, 0);
    }

    @Test(timeout = 1600)
    public void resultShouldBeMore1500Sec() throws InterruptedException {
        mm.sleepMethod();
    }

}
