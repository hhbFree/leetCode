package design.listenter.demo4;

/**
 * @Description:
 * @Author: hbHao
 * @Date: 2020/6/10 15:04
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Future<String> future = new Future<>();
        future.addListener(resultFu -> {

            System.out.println("回调");
        });
        //通知
        System.out.println("通知");
        future.complete("回调");
    }
}
