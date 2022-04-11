package utility;

import java.util.Random;

public class Terminal {

    private final static int UPPER_LIMIT = 11;
    private final static int LOWER_LIMIT = 1;
    private final static int BOUND = 1;

    public static int generateRandomNumber() {

        Random randomNumber = new Random();
        return randomNumber.nextInt(UPPER_LIMIT - LOWER_LIMIT) + BOUND;
    }

}