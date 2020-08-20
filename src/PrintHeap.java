/**
 * @Author wangmingzhen
 * @Date 2020/8/21 2:21
 */
public class PrintHeap {

    /**
     * jvm: -Xms1024m -Xmx1024m -XX:+PrintGCDetails
     * PSYoungGen 305664K, ParOldGen 699392K, 305664K + 699392K = 1,005,056 K = 981.5 M
     *
     */
    public static void main(String[] args) {
        long max = Runtime.getRuntime().maxMemory();
        long total = Runtime.getRuntime().totalMemory();
        long free = Runtime.getRuntime().freeMemory();
        long avaProc = Runtime.getRuntime().availableProcessors();

        System.out.println("max="+max+" Byte \t "+(max/(double)1024/1024)+" MB \t "+((float)max/1024/1024/1024)+" GB");
        System.out.println("total="+total+" Byte \t "+(total/(double)1024/1024)+ " MB \t "+((float)total/1024/1024/1024)+" GB");
        System.out.println("free="+free+" Byte \t "+(free/(double)1024/1024)+" MB \t "+((float)free/1024/1024/1024)+" GB");
        System.out.println("availableProcessors="+avaProc);

    }

}
