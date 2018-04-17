package personal.nathan.state.sample2;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/16.
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
