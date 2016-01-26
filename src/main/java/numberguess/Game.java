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
    private String opinion;

    public int getNumber() {
        return number.get();
    }

    public String getMessage() {
        return messageHolder.getMessage();
    }

    public void check() {
        messageHolder.setMessage(opinion);
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getOpinion() {
        return opinion;
    }
}
