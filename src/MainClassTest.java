
import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassString(){
        Assert.assertTrue("Substring is not found", MainClass.getClassString().contains("Hello") || MainClass.getClassString().contains(("hello")));
    }
}
