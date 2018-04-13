package personal.nathan.visitor.sample2;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/12.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
