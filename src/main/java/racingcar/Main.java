package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNameList = sc.nextLine();
        String[] arrayString = carNameList.split(",");

        System.out.println("시도할 횟수는 몇회인가요?");
        int tryCount = sc.nextInt();

        RacingGame racingGame = new RacingGame();
        List<Car> carList = new ArrayList<>();
        //경주 시작
        for (String cName : arrayString) {
            Car car = new Car(cName, 1);
            carList.add(car);
        }
        racingGame.setCars(carList);
        racingGame.printCarsDistance();
        // 횟수만큼 반복
        for (int i = 0; i < tryCount; i++) {
            racingGame.racing();
            racingGame.printCarsDistance();
        }
        // 우승자 출력
        racingGame.printWinners(carList);
    }

}
