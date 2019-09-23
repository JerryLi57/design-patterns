package demo.ListCompare;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: asdfas
 * @author: lijiayu
 * @date: 2019-09-12 14:14
 **/
public class TestPutIfAbsent {

    public static Map<Long, HotUserId> userIds = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        HotUserId u1 = userIds.putIfAbsent(1L, new HotUserId(1L, 1L));
        System.out.println(u1);
        HotUserId u2 = userIds.putIfAbsent(1L, new HotUserId(2L, 2L));
        System.out.println(u2);
        HotUserId u3 = userIds.putIfAbsent(1L, new HotUserId(3L, 3L));
        System.out.println(u3);
        u3.setTimestamp(3L);
        System.out.println(userIds.get(1L));

    }
}
