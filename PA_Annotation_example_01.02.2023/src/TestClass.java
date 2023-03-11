
public class TestClass {
    @TestMethodAnnotation(a = 123, b = 456)
    public void test(int a, int b) {
        int minus = b - a;
        int plus = a + b;
        if (plus < minus) {
            System.out.println("This is false.");
        } else {
            System.out.println("This is true.");
        }
    }
}
