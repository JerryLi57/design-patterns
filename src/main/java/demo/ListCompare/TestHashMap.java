package demo.ListCompare;

import com.carrotsearch.sizeof.RamUsageEstimator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: testlist
 * @author: lijiayu
 * @date: 2019-09-11 10:49
 **/
public class TestHashMap {

    public static void main(String[] args) {
        long count = 300000;
        long stime = System.currentTimeMillis();
        for (long i = 10000; i < count; i++) {
            HotUserIdManager.add(new HotUserId(i, i));
        }
        long etime = System.currentTimeMillis();
        System.out.println("ArrayList elapsed time:" + (etime - stime));

        stime = System.currentTimeMillis();
        for (long i = 10000; i < count; i++) {
            HotUserIdManagerHashMap.add(i);
        }
        etime = System.currentTimeMillis();
        System.out.println("HashMap elapsed time:" + (etime - stime));

        System.out.println(RamUsageEstimator.sizeOf(HotUserIdManagerHashMap.userIds));
        System.out.println(RamUsageEstimator.sizeOf(HotUserIdManager.userIds));

        stime = System.currentTimeMillis();
        System.out.println(HotUserIdManagerHashMap.getHotUserId(268888));
        System.out.println("HashMap count:" + HotUserIdManagerHashMap.count);
        etime = System.currentTimeMillis();
        System.out.println("HashMap elapsed time:" + (etime - stime));

        stime = System.currentTimeMillis();
        System.out.println(HotUserIdManager.getHotUserId(268888));
        System.out.println("ArrayList count:" + HotUserIdManager.count);
        etime = System.currentTimeMillis();
        System.out.println("ArrayList elapsed time:" + (etime - stime));

        HotUserIdManagerHashMap.add(168888L);
        stime = System.currentTimeMillis();
        List<Long> lists = HotUserIdManagerHashMap.listOldUserId(10);
        System.out.println("Comparator elapsed time:" + (System.currentTimeMillis() - stime));
        stime = System.currentTimeMillis();
        int i = 0;
        for (Long s : lists) {
            System.out.println(HotUserIdManagerHashMap.getHotUserId(s));
            if (i++ == 10) {
                break;
            }
        }
        System.out.println("ArrayList elapsed time:" + (System.currentTimeMillis() - stime));
        stime = System.currentTimeMillis();
    }
}
