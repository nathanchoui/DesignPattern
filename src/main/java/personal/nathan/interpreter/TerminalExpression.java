package personal.nathan.interpreter;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/17.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
