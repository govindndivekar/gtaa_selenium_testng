import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDataFromTestNGTest {

    @Parameters({"first_name"})
    @Test
    public void test01(String firstName){
        System.out.print(firstName);
    }
}
