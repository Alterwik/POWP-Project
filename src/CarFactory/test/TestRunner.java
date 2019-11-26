import tests.BuilderTest;
import tests.CarDecoratorTest;
import tests.CarFactoryTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import tests.CarPublisherTest;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
                BuilderTest.class,
                CarFactoryTest.class,
                CarDecoratorTest.class,
                CarPublisherTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
} 