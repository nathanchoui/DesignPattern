package personal.nathan.mediator.sample2;

import java.util.Date;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/4/15.
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
