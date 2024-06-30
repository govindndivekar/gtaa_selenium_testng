import org.testng.annotations.Test;

public class DataProviderParallelTests {

    @Test(dataProvider = "parallelTest", dataProviderClass = TestDataProviderParallelTest.class)
    public void test01(Integer n){
        System.out.print(n);

    }
}
