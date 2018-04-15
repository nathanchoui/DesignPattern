package personal.nathan.mediator.sample2;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/4/15.
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
