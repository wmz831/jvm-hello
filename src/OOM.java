import java.util.Random;

/**
 * @Author wangmingzhen
 * @Date 2020/8/21 2:30
 */
public class OOM {

    /**
     * jvm: -Xms8m -Xmx8m -XX:+PrintGCDetails
     * @param args
     */
    public static void main(String[] args) {
        String str = "getAOutOfMemeryException";
        while(true){
            str = str + new Random().nextInt(999999999) + new Random().nextInt(999999999);
        }
    }

}
