package numberguess;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class Game implements Serializable {

    @Inject
    @RandomNumber
    private Instance<Integer> number;
    @Inject
    private MessageHolder messageHolder;

    public int getNumber() {
        return number.get();
    }

    @Logging
    public String getMessage() {
        return messageHolder.getMessage();
    }
}
