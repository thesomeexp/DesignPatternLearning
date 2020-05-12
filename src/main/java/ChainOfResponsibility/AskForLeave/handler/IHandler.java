package ChainOfResponsibility.AskForLeave.handler;

import ChainOfResponsibility.AskForLeave.pojo.IStudent;

/**
 * 抽象处理者接口
 */
public interface IHandler {
    // 处理请求
    void handleRequest(IStudent student);

    // 设置下一个处理者
    void setHandler(IHandler handler);
}
