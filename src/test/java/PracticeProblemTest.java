import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeProblemTest {

    // ==================== isFive() Tests ====================

    @Test
    @DisplayName("isFive - input is 5, should return 'The number is Five'")
    void isFiveTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("isFive", cArg);
            assertEquals("The number is Five", (String) method.invoke(null, 5));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("isFive - input is not 5, should return 'The number is not Five'")
    void isFiveTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("isFive", cArg);
            assertEquals("The number is not Five", (String) method.invoke(null, 3));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("isFive - input is negative number, should return 'The number is not Five'")
    void isFiveTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("isFive", cArg);
            assertEquals("The number is not Five", (String) method.invoke(null, -5));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("isFive - input is 0, should return 'The number is not Five'")
    void isFiveTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("isFive", cArg);
            assertEquals("The number is not Five", (String) method.invoke(null, 0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // ==================== positiveOrNegative() Tests ====================

    @Test
    @DisplayName("positiveOrNegative - input is positive double, should return 'Positive'")
    void positiveOrNegativeTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { double.class };
            Method method = testClass.getDeclaredMethod("positiveOrNegative", cArg);
            assertEquals("Positive", (String) method.invoke(null, 7.5));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("positiveOrNegative - input is negative double, should return 'Negative'")
    void positiveOrNegativeTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { double.class };
            Method method = testClass.getDeclaredMethod("positiveOrNegative", cArg);
            assertEquals("Negative", (String) method.invoke(null, -3.2));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("positiveOrNegative - input is 0, should return 'Negative'")
    void positiveOrNegativeTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { double.class };
            Method method = testClass.getDeclaredMethod("positiveOrNegative", cArg);
            assertEquals("Negative", (String) method.invoke(null, 0.0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("positiveOrNegative - input is very small positive double, should return 'Positive'")
    void positiveOrNegativeTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { double.class };
            Method method = testClass.getDeclaredMethod("positiveOrNegative", cArg);
            assertEquals("Positive", (String) method.invoke(null, 0.0001));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // ==================== highOrLow() Tests ====================

    @Test
    @DisplayName("highOrLow - input is above 100, should return 'High'")
    void highOrLowTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("highOrLow", cArg);
            assertEquals("High", (String) method.invoke(null, 150));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("highOrLow - input is exactly 100, should return 'Low'")
    void highOrLowTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("highOrLow", cArg);
            assertEquals("Low", (String) method.invoke(null, 100));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("highOrLow - input is below 100, should return 'Low'")
    void highOrLowTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("highOrLow", cArg);
            assertEquals("Low", (String) method.invoke(null, 50));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("highOrLow - input is 101, should return 'High'")
    void highOrLowTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("highOrLow", cArg);
            assertEquals("High", (String) method.invoke(null, 101));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // ==================== isHello() Tests ====================

    @Test
    @DisplayName("isHello - input is 'Hello', should return 'The word is Hello'")
    void isHelloTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("isHello", cArg);
            assertEquals("The word is Hello", (String) method.invoke(null, "Hello"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("isHello - input is not 'Hello', should return 'The word is not Hello'")
    void isHelloTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("isHello", cArg);
            assertEquals("The word is not Hello", (String) method.invoke(null, "World"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("isHello - input is lowercase 'hello', should return 'The word is not Hello'")
    void isHelloTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("isHello", cArg);
            assertEquals("The word is not Hello", (String) method.invoke(null, "hello"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("isHello - input is empty string, should return 'The word is not Hello'")
    void isHelloTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("isHello", cArg);
            assertEquals("The word is not Hello", (String) method.invoke(null, ""));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }
}