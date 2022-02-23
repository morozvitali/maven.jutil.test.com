import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StackTest {

    // before, create static object
    public static Object objTest;
    public static Stack stackArrayTest;


    @BeforeClass
    public static void beforeTest() {
        objTest = new Object();
        stackArrayTest = new Stack();
    }

    @Test
    public void arrayShouldBeEmpty() {
        Assert.assertTrue(stackArrayTest.isArrayIsEmpty(stackArrayTest.objArray));
    }// method isEmpty ok it's empty

    @Test
    public void arrayShouldNotBeBeEmptyPushMethod() {
        stackArrayTest.push(); // action
        boolean arrayIsEmpty = stackArrayTest.isArrayIsEmpty(stackArrayTest.objArray);
        Assert.assertFalse(stackArrayTest.ArrayIsEmpty);
    }// method isEmpty ok it's not empty


    @Test
    public void arrayShouldBeBeOneElementPushMethod() {
        stackArrayTest.push(); // action
        Assert.assertEquals(1, stackArrayTest.objArray.length);
    }

    @Test
    public void arrayShouldBeTenElementsPushMethod() {
        stackArrayTest.push(); // action
        stackArrayTest.push(); // action
        stackArrayTest.push(); // action
        stackArrayTest.push(); // action
        stackArrayTest.push(); // action
        stackArrayTest.push(); // action
        stackArrayTest.push(); // action
        stackArrayTest.push(); // action
        stackArrayTest.push(); // action
        stackArrayTest.push(); // action
        Assert.assertEquals(10, stackArrayTest.objArray.length);
    }

    @Test
    public void arrayShouldBeEmptyPopMethod() {
        stackArrayTest.push(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.push(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.push(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.push(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.push(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.push(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.push(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.pop(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.pop(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.pop(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.pop(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.push(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.pop(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.pop(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.pop(); // action
        System.out.println(stackArrayTest.toString());
        stackArrayTest.pop(); // action
        System.out.println(stackArrayTest.toString());

        stackArrayTest.pop(); // action
        System.out.println(stackArrayTest.toString());


        Assert.assertEquals(0, stackArrayTest.objArray.length);
    }
}
