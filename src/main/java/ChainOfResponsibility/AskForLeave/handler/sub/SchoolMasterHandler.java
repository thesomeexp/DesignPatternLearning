package ChainOfResponsibility.AskForLeave.handler.sub;

import ChainOfResponsibility.AskForLeave.handler.AbstractHandler;
import ChainOfResponsibility.AskForLeave.pojo.IStudent;

public class SchoolMasterHandler extends AbstractHandler {

    public SchoolMasterHandler() {
        super(2);
    }

    // 子类具体处理请求
    @Override
    public void process(IStudent student) {
        System.out.println("校长 批复: " + student.getRequestMessage());
    }
}
