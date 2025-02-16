package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private static final int ANNEX = 1;
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), random.nextInt(MAX_NUMBER) + ANNEX);
    }
}
