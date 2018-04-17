package personal.nathan.state.sample2;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/16.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
