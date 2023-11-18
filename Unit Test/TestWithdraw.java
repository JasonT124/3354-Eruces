import org.junit.Test;
import static org.junit.Assert.*;

public class TestWithdraw extends Account {

    @Test
    public void testCorrect() {
        assertEquals("Here is the test for withdraw", true, withdraw(200));
    }

    @Test
    public void testIncorrect() {
        assertEquals("Here is the test for withdraw", true, withdraw(2000));
    }
}
