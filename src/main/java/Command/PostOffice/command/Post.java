package Command.PostOffice.command;

import Command.PostOffice.receiver.IReceiver;
import Command.PostOffice.receiver.Receiver;

/**
 * 邮局实现类
 */
public class Post implements IPost {
    // 收件人对象实例
    private final IReceiver receiver;

    /**
     * 构造方法传入收件人对象实例
     */
    public Post (IReceiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 邮局发送信件
     */
    @Override
    public void sendMail(String message) {
        System.out.println("邮局将信件发给收信人...");
        // 邮局将信件发给收信人
        this.receiver.readMail(message);
    }
}
