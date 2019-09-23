package demo.ListCompare;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @description: 活动用户Id列表管理器
 * @author: lijiayu
 * @date: 2019-09-10 20:11
 **/
public class HotUserIdManagerTreeSet {

    public static Set<HotUserId> userIds = new TreeSet<>();

    private static int MAX_NUMBERS_OF_USERIDS = 300000;

    public static int count;

    public synchronized static boolean add(HotUserId hotUserId) {
        return userIds.add(hotUserId);
    }

    public static HotUserId getHotUserId(long userId) {
        if (userIds.isEmpty()) {
            return null;
        }
        for(HotUserId user:userIds){
            count++;
            if(user.getUserId() == userId){
                return user;
            }
        }
        return null;
//        sortByUserId();
//        return getHotUserId(userIds, userId, 0, userIds.size() - 1);
    }



    /**
     * 二分查找法获取数据
     *
     * @param innerUserIds
     * @param userId
     * @param lowIndex
     * @param highIndex
     * @return
     */
    private static HotUserId getHotUserId(List<HotUserId> innerUserIds, long userId, int lowIndex, int highIndex) {
        count++;
        if (lowIndex >= highIndex) {
            HotUserId hotUserId = innerUserIds.get(lowIndex);
            if (userId == hotUserId.getUserId()) {
                return hotUserId;
            }
            return null;
        }
        int middle = lowIndex + (highIndex - lowIndex) / 2;
        HotUserId midHotUserId = innerUserIds.get(middle);
        if (userId == midHotUserId.getUserId()) {
            return midHotUserId;
        } else if (userId > midHotUserId.getUserId()) {
            return getHotUserId(innerUserIds, userId, middle + 1, highIndex);
        } else {
            return getHotUserId(innerUserIds, userId, lowIndex, middle - 1);
        }
    }

}
