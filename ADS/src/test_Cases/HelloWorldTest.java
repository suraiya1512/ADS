import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        String expected = "Hello, World!";
        String actual = HelloWorld.getGreeting();
        Assert.assertEquals(actual, expected);
    }
}