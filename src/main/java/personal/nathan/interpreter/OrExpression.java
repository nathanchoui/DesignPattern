package personal.nathan.interpreter;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/17.
 */
public class OrExpression implements Expression{

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
