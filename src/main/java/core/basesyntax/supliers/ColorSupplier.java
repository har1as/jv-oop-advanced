package core.basesyntax.supliers;

import java.util.Random;

public class ColorSupplier {
    private static final Colors[] colors = Colors.values();
    private static final Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)].toString();
    }
}
