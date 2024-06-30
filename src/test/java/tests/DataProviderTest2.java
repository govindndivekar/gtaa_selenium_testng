import org.testng.annotations.Test;

public class DataProviderTest2 {

    @Test(dataProvider = "create", dataProviderClass = TestDataProvider.class)
    public void test01(Integer n1){
        System.out.print(n1);
    }
}
