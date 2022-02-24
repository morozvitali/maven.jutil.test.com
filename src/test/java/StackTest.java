import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StackTest {
//    public static Object objTest;
    public static Stack stackArrayTest;

    @BeforeClass
    public static void beforeTest() {
//        objTest = new Object();
        stackArrayTest = new Stack();
    }

    @Test
    public void arrayShouldBeEmpty() {
        Assert.assertTrue(stackArrayTest.isArrayIsEmpty(stackArrayTest.objArray));
    }

    @Test
    public void arrayShouldNotBeBeEmptyPushMethod() {
        stackArrayTest.push();
        boolean arrayIsEmpty = stackArrayTest.isArrayIsEmpty(stackArrayTest.objArray);
        Assert.assertFalse(stackArrayTest.ArrayIsEmpty);
    }


    @Test
    public void arrayShouldBeBeOneElementPushMethod() {
        stackArrayTest.push();

        Assert.assertEquals(1, stackArrayTest.objArray.length); // тут баг, команда пуш статик и ленгс статик.... капец
    }

//    @Test
//    public void arrayShouldBeTenElementsPushMethod() {
//        stackArrayTest.push();
//        stackArrayTest.push();
//        stackArrayTest.push();
//
//        Assert.assertEquals(3, stackArrayTest.objArray.length);
//    }

//    @Test
//    public void arrayShouldBeEmptyPopMethod() {
//        stackArrayTest.push();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.push();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.push();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.push();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.push();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.push();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.push();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.pop();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.pop();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.pop();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.pop();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.push();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.pop();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.pop();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.pop();
//        System.out.println(stackArrayTest.toString());
//        stackArrayTest.pop();
//        System.out.println(stackArrayTest.toString());
//
//
//
//        Assert.assertEquals(0, stackArrayTest.objArray.length);
//    }
}
