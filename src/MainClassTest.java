import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber(){
        Assert.assertTrue("Class number less than 45",MainClass.getClassNumber() > 45);
    }
}
