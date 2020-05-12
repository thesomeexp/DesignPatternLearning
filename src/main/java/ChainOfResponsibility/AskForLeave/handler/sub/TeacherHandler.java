package ChainOfResponsibility.AskForLeave.handler.sub;

import ChainOfResponsibility.AskForLeave.handler.AbstractHandler;
import ChainOfResponsibility.AskForLeave.pojo.IStudent;

/**
 * 老师处理者
 */
public class TeacherHandler extends AbstractHandler {

    public TeacherHandler() {
        super(1);
    }

    // 子类具体处理请求
    @Override
    public void process(IStudent student) {
        System.out.println("老师 批复: " + student.getRequestMessage());
    }
}
