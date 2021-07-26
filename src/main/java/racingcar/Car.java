package racingcar;

public class Car {
    private final String name;
    private int position = 0;
    private int randomNum = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }

    // 추가 기능 구현
    public void pushPedal() {
        position++;
    }
}
