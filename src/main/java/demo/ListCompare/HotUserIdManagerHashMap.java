package demo.ListCompare;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: 活动用户Id列表管理器
 * @author: lijiayu
 * @date: 2019-09-10 20:11
 **/
public class HotUserIdManagerHashMap {

    public static Map<Long, HotUserId> userIds = new ConcurrentHashMap<>();

    private static int MAX_NUMBERS_OF_USERIDS = 300000;

    public static int count;

    public static HotUserId add(Long userId) {

        if(userId == 168888){
            System.out.println(System.currentTimeMillis());
        }
        HotUserId savedUser = userIds.putIfAbsent(userId, new HotUserId(userId, System.currentTimeMillis()));
        // 如果对象已存在 则更新
        if(null == savedUser){
            savedUser = userIds.get(userId);
            savedUser.setTimestamp(System.currentTimeMillis());
        }
        return savedUser;
    }

    public static HotUserId getHotUserId(long userId) {
        if (userIds.isEmpty()) {
            return null;
        }
        return userIds.get(Long.valueOf(userId));
    }

    public static int size(){
        return userIds.size();
    }

    public static List<Long> listOldUserId(int num) {
        Stream<Map.Entry<Long, HotUserId>> st = userIds.entrySet().stream();
        List<Long> lists = st.sorted((Map.Entry<Long, HotUserId> o1, Map.Entry<Long, HotUserId> o2) ->
                (int) (o2.getValue().getTimestamp() - o1.getValue().getTimestamp()))
                .map(entry -> entry.getKey()).collect(Collectors.toList()).subList(0, num);
        return lists;
    }

}
