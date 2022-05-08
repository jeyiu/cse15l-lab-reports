import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {
    @Test
    public void TestFile1() throws IOException{
        int result = Calculator.calculateSum("test-file1");
        assertEquals("Testing file 1", result,  55);
    }
}
