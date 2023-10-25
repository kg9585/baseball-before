package baseball;

public class Computer {

    static final int NUMBER_LENGTH = 3;
    static final int DIGIT_MAX = 9;
    static final int DIGIT_MIN = 1;
    int randomNumber;

    public Computer() {
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber() {
        this.randomNumber = generateRandomNumber();
    }

    private int generateRandomNumber() {
        String number = Stream.generate(() -> Randoms.pickNumberInRange(DIGIT_MIN, DIGIT_MAX))
                .map(String::valueOf)
                .distinct()
                .limit(NUMBER_LENGTH)
                .collect(Collectors.joining(""));
        return Integer.parseInt(number);
    }
}