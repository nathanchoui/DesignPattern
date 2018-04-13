package personal.nathan.visitor.sample1;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/13.
 */
public class SizeVisitor extends Visitor {

    public void visit(File file) {

    }

    public void visit(Directory directory) {
        System.out.println(directory.getSize());
    }
}
