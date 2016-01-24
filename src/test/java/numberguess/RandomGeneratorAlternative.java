package numberguess;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;

@ApplicationScoped @Alternative
public class RandomGeneratorAlternative {

    @Produces
    @RandomNumber
    public int nextFixedNumber() {
        return 33;
    }
}
