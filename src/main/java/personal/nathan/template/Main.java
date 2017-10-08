package personal.nathan.template;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/8.
 */
public class Main {

    public static void main(String[] args) {
        AbstracDisplay charDisplay = new CharDisplay('a');
        charDisplay.display();


        AbstracDisplay stringDisplay = new StringDisplay("sassdad");
        stringDisplay.display();
    }
}
