import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessYearTest {

    @Test
    public void testDefineYear() {
        // given:
        GuessYear gy = new GuessYear();
        int year = 2022, expectedResult = 365;
        // when:
        int result = gy.defineYear(year);
        // then:
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testDaysEnteredUser() {
        // given:
        GuessYear gy = new GuessYear();
        int year = 2020;
        Scanner scanner = new Scanner("366");
        // when:
        int expectedResult = scanner.nextInt();
        int result = gy.defineYear(year);
        // then:
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testScan() {
        // given:
        Scanner scanner = new Scanner("ten");
        // then:
        Assertions.assertThrowsExactly(InputMismatchException.class,
                () -> scanner.nextInt());
    }
}
