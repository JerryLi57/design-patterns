package design.patterns.chainOfResponsibility;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 请假请求
 * @author: lijiayu
 * @date: 2020-08-04 14:37
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaveRequest {

    /**天数*/
    private int leaveDays;

    /**姓名*/
    private String name;
}
