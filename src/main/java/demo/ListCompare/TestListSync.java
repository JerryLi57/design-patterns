package demo.ListCompare;

import com.carrotsearch.sizeof.RamUsageEstimator;

/**
 * @description: testlist
 * @author: lijiayu
 * @date: 2019-09-11 10:49
 **/
public class TestListSync {

    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                long count = 300000;
                for(long i=10000; i<count; i++){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("userId:"+i);
                    HotUserIdManager.add(new HotUserId(i,i));
                }
            }
        }).start();
        System.out.println("=============================");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(HotUserIdManager.getHotUserId(168888));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HotUserIdManager.sortByUserId();
        for(HotUserId u : HotUserIdManager.userIds){
            System.out.println("sort userId"+u.getUserId());
        }
        System.out.println("=============================end===");
    }
}
