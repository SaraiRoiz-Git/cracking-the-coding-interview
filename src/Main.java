import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(StringsTest.class);
        Result link= JUnitCore.runClasses(LinkedListTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        for (Failure failure : link.getFailures()) {
            System.out.println(failure.toString());
        }

    }
}
