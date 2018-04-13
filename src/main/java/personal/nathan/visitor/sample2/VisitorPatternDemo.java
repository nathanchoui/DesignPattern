package personal.nathan.visitor.sample2;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/12.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
