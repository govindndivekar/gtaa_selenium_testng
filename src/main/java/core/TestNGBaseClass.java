package core;

import org.testng.TestNG;

public class TestNGBaseClass extends TestNG {

    public static void main(String[] args){
        TestNG testNG = new TestNG();
        testNG.run();
    }
}
