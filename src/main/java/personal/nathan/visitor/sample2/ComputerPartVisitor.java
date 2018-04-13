package personal.nathan.visitor.sample2;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/12.
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
