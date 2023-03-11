import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestClass testClass = new TestClass();
        final Class<?> cls = TestClass.class;

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(TestMethodAnnotation.class)) {
                TestMethodAnnotation tMA = method.getAnnotation(TestMethodAnnotation.class);
                method.invoke(testClass, tMA.a(), tMA.b());
            }
        }
    }
}