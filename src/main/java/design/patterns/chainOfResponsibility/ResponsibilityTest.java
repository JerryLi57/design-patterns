package design.patterns.chainOfResponsibility;

/**
 * @description:
 * @author: lijiayu
 * @date: 2020-08-04 16:06
 **/
public class ResponsibilityTest {

    public static void main(String[] args) {
        LeaveRequest request = LeaveRequest.builder().leaveDays(1).name("小明").build();


        AbstractLeaveHandler directLeaderLeaveHandler = new DirectLeaderLeaveHandler("县令");
        DeptManagerLeaveHandler deptManagerLeaveHandler = new DeptManagerLeaveHandler("知府");
        GManagerLeaveHandler gManagerLeaveHandler = new GManagerLeaveHandler("京兆尹");

        directLeaderLeaveHandler.setNextHandler(deptManagerLeaveHandler);
        deptManagerLeaveHandler.setNextHandler(gManagerLeaveHandler);

        directLeaderLeaveHandler.handlerRequest(request);
    }
}
