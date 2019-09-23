package demo.ListCompare;

import com.carrotsearch.sizeof.RamUsageEstimator;

/**
 * @description: testlist
 * @author: lijiayu
 * @date: 2019-09-11 10:49
 **/
public class TestList {

    public static void main(String[] args) {
        long count = 3000000;
        long stime = System.currentTimeMillis();
        for(long i=10000; i<count; i++){
            HotUserIdManager2.add(new HotUserId(i,i));
        }
        long etime = System.currentTimeMillis();
        System.out.println("LinkedList elapsed time:"+ (etime - stime));
        stime = System.currentTimeMillis();
        for(long i=10000; i<count; i++){
            HotUserIdManager.add(new HotUserId(i,i));
        }
        etime = System.currentTimeMillis();
        System.out.println("ArrayList elapsed time:"+ (etime - stime));
        System.out.println(RamUsageEstimator.sizeOf(HotUserIdManager.userIds));
        System.out.println(RamUsageEstimator.sizeOf(HotUserIdManager2.userIds));
        stime = System.currentTimeMillis();
        System.out.println(HotUserIdManager.getHotUserId(2688888));
        System.out.println("ArrayList count:"+HotUserIdManager.count);
        etime = System.currentTimeMillis();
        System.out.println("ArrayList elapsed time:"+ (etime - stime));

        stime = System.currentTimeMillis();
        System.out.println(HotUserIdManager2.getHotUserId(2688888));
        System.out.println("LinkedList count:"+HotUserIdManager2.count);
        etime = System.currentTimeMillis();
        System.out.println("LinkedList elapsed time:"+ (etime - stime));
    }
}
