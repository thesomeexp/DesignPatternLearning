package Command.PostOffice.command;

/**
 * 邮局接口
 */
public interface IPost {
    /**
     * 邮局发送信件
     */
    void sendMail(String message);
}
