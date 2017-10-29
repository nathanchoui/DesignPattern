package personal.nathan.factory.IDCard;

import personal.nathan.factory.framework.Product;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/15.
 */
public class IDCard extends Product {

    private String owner;

    private long seqNo;

    IDCard(long seqNo, String owner) {
        System.out.println(String.format("making  %d:%s's IDCard", seqNo, owner));
        this.seqNo = seqNo;
        this.owner = owner;
    }

    public void use() {
        System.out.println("using " + seqNo + ":" + owner + "'s card!");
    }

    public String getOwner() {
        return owner;
    }

    public long getSeqNo() {
        return seqNo;
    }


}
