package racingcar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RacingGameResultTest {
    @Test
    void testIsMove_Move() {
        Car car = new Car("TestCar", 0);
        assertTrue(car.isMove(4));
    }

    @Test
    void testIsMove_NoMove() {
        Car car = new Car("TestCar", 0);
        assertFalse(car.isMove(3));
    }
}
