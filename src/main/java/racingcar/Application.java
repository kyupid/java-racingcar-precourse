package racingcar;

import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");

        String[] names = scanner.next().split(",");
        int distanceOfLane = scanner.nextInt();

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            cars.add(new Car(names[i]));
        }

        for (int i = 0; i < distanceOfLane; i++) {
                int randomNumber = RandomUtils.nextInt(0, 9);
                Car car = cars.get(i);
                String name = car.getName();
                System.out.print(name + " : ");
                if (randomNumber > 3) {
                    System.out.println("-");
                } else {
                    break;
                }
        }
    }
}
