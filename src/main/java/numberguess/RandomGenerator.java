package numberguess;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class RandomGenerator {

    private Random random = new Random(System.currentTimeMillis());

    @Produces
    @RandomNumber
    public int nextRandomNumber() {
        return random.nextInt(100) + 1;
    }

}
