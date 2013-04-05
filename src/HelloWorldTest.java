import static org.hamcrest.CoreMatchers.equalTo;
import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;


public class HelloWorldTest extends junit.framework.TestCase {
    @Test
    public void testAssertEquals() {
        org.junit.Assert.assertEquals("failure - strings not same", 5l, 5l);
    }
}
