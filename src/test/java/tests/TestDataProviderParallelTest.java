import org.testng.annotations.DataProvider;

public class TestDataProviderParallelTest {

    @DataProvider(name = "parallelTest", parallel = true)
    public Object[] createTestData(){
        return new Object[] {1,2};
    }
}
