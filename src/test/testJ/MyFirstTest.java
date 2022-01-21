import org.junit.Assert;
import org.junit.Test;
import test.TestMethod;

public class MyFirstTest {
    @Test
    public void firstTest() {

        Assert.assertTrue(new TestMethod().print("smth").equals("test1"));
    }
}
