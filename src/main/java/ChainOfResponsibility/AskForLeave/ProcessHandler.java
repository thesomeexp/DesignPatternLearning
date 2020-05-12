package ChainOfResponsibility.AskForLeave;

import ChainOfResponsibility.AskForLeave.handler.IHandler;
import ChainOfResponsibility.AskForLeave.handler.sub.SchoolMasterHandler;
import ChainOfResponsibility.AskForLeave.handler.sub.SquadLeaderHandler;
import ChainOfResponsibility.AskForLeave.handler.sub.TeacherHandler;
import ChainOfResponsibility.AskForLeave.pojo.IStudent;

/**
 * 这里用到了外观模式 设置责任链关联
 */
public class ProcessHandler {

    // 班长处理者
    private final IHandler sqmshandler;
    // 老师处理者
    private final IHandler teachhandler;
    // 校长处理者
    private final IHandler scmshandler;

    // 单例模式
    private static ProcessHandler processHandler = new ProcessHandler();

    /**
     * 构造方法, 建立请假处理责任链
     */
    private ProcessHandler() {
        // 创建处理对象
        // 班长
        this.sqmshandler = new SquadLeaderHandler();
        // 老师
        this.teachhandler = new TeacherHandler();
        // 校长
        this.scmshandler = new SchoolMasterHandler();
        /**
         * 建立责任链
         */
        // 设置班长的下一个处理者: 老师
        this.sqmshandler.setHandler(this.teachhandler);
        // 设置老师的下一个处理者: 校长
        this.teachhandler.setHandler(this.scmshandler);
    }

    /**
     * 获得单例对象实例
     */
    public static ProcessHandler getInstance() {
        return processHandler;
    }

    /**
     * 发送请假请求
     */
    public void sendMessage(IStudent student) {
        // 发送给第一个处理者: 班长处理
        this.sqmshandler.handleRequest(student);
    }
}
