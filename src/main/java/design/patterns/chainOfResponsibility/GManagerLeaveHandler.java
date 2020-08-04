package design.patterns.chainOfResponsibility;

/**
 * @description: 总经理处理类
 * @author: lijiayu
 * @date: 2020-08-04 16:05
 **/
public class GManagerLeaveHandler extends AbstractLeaveHandler {
    public GManagerLeaveHandler(String name) {
        this.handlerName = name;
    }

    @Override
    protected void handlerRequest(LeaveRequest request) {
        if (request.getLeaveDays() > MIDDLE && request.getLeaveDays() <= MAX) {
            System.out.println("总经理:" + handlerName + ",已经处理;流程结束。");
            return;
        }

        if (null != this.nextHandler) {
            this.nextHandler.handlerRequest(request);
        } else {
            System.out.println("审批拒绝！");
        }
    }
}