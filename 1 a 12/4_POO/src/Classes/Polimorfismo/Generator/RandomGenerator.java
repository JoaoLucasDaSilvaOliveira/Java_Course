package Classes.Polimorfismo.Generator;

import java.util.Random;

public class RandomGenerator implements Generator{
    private final Random random = new Random();
    @Override
    public int next() {
        return random.nextInt(0, 100);
    }
}
