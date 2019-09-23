package demo.ListCompare;

import java.util.List;

/**
 * @description: testlist
 * @author: lijiayu
 * @date: 2019-09-11 10:49
 **/
public class TestHashMapSync {

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
                    HotUserIdManagerHashMap.add(i);
                }
            }
        }).start();
        System.out.println("=============================");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(HotUserIdManagerHashMap.getHotUserId(168888));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Long> lists = HotUserIdManagerHashMap.listOldUserId(HotUserIdManagerHashMap.size());
        for(Long u : lists){
            System.out.println("sort userId ========================== :"+u);
        }
        System.out.println("=============================end===");
    }
}
