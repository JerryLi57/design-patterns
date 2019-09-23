package demo.ListCompare;


import lombok.Data;

import java.util.*;

/**
 * @description: 活跃用户ID的对象封装类
 * @author: lijiayu
 * @date: 2019-09-10 19:47
 **/
@Data
public class HotUserId implements Comparable {

    /**
     * 用户ID
     */
    private long userId;

    /**
     * 时间戳
     */
    private long timestamp;

    public HotUserId(long userId, long timestamp) {
        this.userId = userId;
        this.timestamp = timestamp;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof HotUserId) {
            HotUserId obj = (HotUserId) o;
            if (this.getUserId() > obj.getUserId()) {
                return 1;
            } else if (this.getUserId() == obj.getUserId()) {
                return 0;
            } else {
                return -1;
            }
        }
        return 0;
    }
}
