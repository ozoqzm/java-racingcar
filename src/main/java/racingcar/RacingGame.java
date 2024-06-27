package racingcar;

import java.util.List;

public class RacingGame {
    private List<Car> cars;

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    public List<Car> getCars() {
        return cars;
    }

    public void racing() {
        for (Car c : cars) {
            int num = c.getRandomNo();
            c.move(num);
        }
    }
    public void printCarsDistance() {
        for (Car c : cars) {
            System.out.print(c.getCarName() + ":");
            for (int i = 0; i < c.getPosition(); i++)
                System.out.print("-");
            System.out.println();
        }
        System.out.println();
    }
}
