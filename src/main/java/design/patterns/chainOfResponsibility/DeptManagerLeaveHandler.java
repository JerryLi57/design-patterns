package design.patterns.chainOfResponsibility;

/**
 * @description: 部门经理处理类
 * @author: lijiayu
 * @date: 2020-08-04 16:04
 **/
public class DeptManagerLeaveHandler extends AbstractLeaveHandler {

    public DeptManagerLeaveHandler(String name) {
        this.handlerName = name;
    }

    @Override
    protected void handlerRequest(LeaveRequest request) {
        if (request.getLeaveDays() > MIN && request.getLeaveDays() <= MIDDLE) {
            System.out.println("部门经理:" + handlerName + ",已经处理;流程结束。");
            return;
        }

        if (null != this.nextHandler) {
            this.nextHandler.handlerRequest(request);
        } else {
            System.out.println("审批拒绝！");
        }
    }
}
