import org.junit.Assert;
import org.junit.Test;

/**
 * testing
 */
public class AdderTest {

    @Test
    public void testAdd() {
        Adder adder = new Adder();
        Assert.assertEquals(5, adder.Add(2,3));
    }
}
