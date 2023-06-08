package SimpleOperationTests;

public class DataProvider {


    @org.testng.annotations.DataProvider(name = "age")
    public static Object[] age() {
        return new Object[][] {{25}, {35}, {45}};
    }


    @org.testng.annotations.DataProvider(name = "letters")
    public static Object[][] letters() {
        return new Object[][] {{1,1}, {2,2}, {3,7}};
    }


    @org.testng.annotations.DataProvider(name = "symbols")
    public static Object[][] symbols() {
        return new Object[][] {{1,1}, {2,2}, {3,7}};
    }
}
