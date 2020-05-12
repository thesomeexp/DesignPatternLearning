package ChainOfResponsibility.AskForLeave.handler.sub;

import ChainOfResponsibility.AskForLeave.handler.AbstractHandler;
import ChainOfResponsibility.AskForLeave.pojo.IStudent;

/**
 * 班长处理者
 */
public class SquadLeaderHandler extends AbstractHandler {

    public SquadLeaderHandler() {
        super(0);
    }

    // 子类具体处理请求
    @Override
    public void process(IStudent student) {
        System.out.println("班长 批复: " + student.getRequestMessage());
    }

}
