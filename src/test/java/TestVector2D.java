import org.junit.Assert;
import org.junit.Test;

public class TestVector2D {
    @Test
    public void newVectorShouldHaveZeroLenght () {
        Vector2D v2d = new Vector2D();      // action
        //        assertion
       Assert.assertEquals(0, v2d.lenhgt(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroX () {
        Vector2D v3d = new Vector2D();
        Assert.assertEquals(0, v3d.getX(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroY () {
        Vector2D v4d = new Vector2D();
        Assert.assertEquals(0, v4d.getY(), 1e-9);

    }



}
