package personal.nathan.visitor.sample2;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/12.
 */
public class Keyboard implements ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
