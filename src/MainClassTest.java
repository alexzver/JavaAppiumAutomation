import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber(){
        Assert.assertEquals("Wrong local number",14, MainClass.getLocalNumber());
    }
}
