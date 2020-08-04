package design.patterns.chainOfResponsibility;

/**
 * @description: 直接主管处理类
 * @author: lijiayu
 * @date: 2020-08-04 16:02
 **/
public class DirectLeaderLeaveHandler extends AbstractLeaveHandler {

    public DirectLeaderLeaveHandler(String name) {
        this.handlerName = name;
    }

    @Override
    protected void handlerRequest(LeaveRequest request) {
        if (request.getLeaveDays() <= MIN) {
            System.out.println("直接主管:" + handlerName + ",已经处理;流程结束。");
            return;
        }

        if (null != this.nextHandler) {
            this.nextHandler.handlerRequest(request);
        } else {
            System.out.println("审批拒绝！");
        }

    }
}