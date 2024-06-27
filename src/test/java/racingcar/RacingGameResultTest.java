package racingcar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RacingGameResultTest {
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void testMove_NotMoved(int initialPosition) {
        Car car = new Car("TestCar", initialPosition);
        car.move(initialPosition);
        assertEquals(initialPosition, car.getPosition());
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7})
    void testMove_Moved(int initialPosition) {
        Car car = new Car("TestCar", initialPosition);
        car.move(initialPosition);
        assertTrue(car.getPosition() > initialPosition);
    }

}
