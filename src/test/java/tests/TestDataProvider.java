import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "create")
    public static Object[][] createData() {
        return new Object[][] {
                new Object[] { 42 }
        };
    }
}
