package Command.PostOffice.receiver;

/**
 * 接收者
 */
public class Receiver implements IReceiver {
    /**
     * 收件人
     */
    public void readMail(String message) {
        System.out.println("收件人读取信件: " + message);
    }
}
