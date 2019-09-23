package demo.ListCompare;

import com.carrotsearch.sizeof.RamUsageEstimator;

/**
 * @description: testlist
 * @author: lijiayu
 * @date: 2019-09-11 10:49
 **/
public class TestTree {

    public static void main(String[] args) {
        long count = 3000000;
        long stime = System.currentTimeMillis();
        for(long i=10000; i<count; i++){
            HotUserIdManagerTreeSet.add(new HotUserId(i,i));
        }
        long etime = System.currentTimeMillis();
        System.out.println("Tree elapsed time:"+ (etime - stime));

        stime = System.currentTimeMillis();
        for(long i=10000; i<count; i++){
            HotUserIdManager.add(new HotUserId(i,i));
        }
        etime = System.currentTimeMillis();
        System.out.println("ArrayList elapsed time:"+ (etime - stime));

        System.out.println(RamUsageEstimator.sizeOf(HotUserIdManagerTreeSet.userIds));
        System.out.println(RamUsageEstimator.sizeOf(HotUserIdManager.userIds));

        stime = System.currentTimeMillis();
        System.out.println(HotUserIdManagerTreeSet.getHotUserId(2688888));
        System.out.println("Tree count:"+HotUserIdManagerTreeSet.count);
        etime = System.currentTimeMillis();
        System.out.println("Tree elapsed time:"+ (etime - stime));

        stime = System.currentTimeMillis();
        System.out.println(HotUserIdManager.getHotUserId(2688888));
        System.out.println("ArrayList count:"+HotUserIdManager.count);
        etime = System.currentTimeMillis();
        System.out.println("ArrayList elapsed time:"+ (etime - stime));

    }
}
