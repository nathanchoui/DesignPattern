package personal.nathan.visitor.sample2;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/12.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
