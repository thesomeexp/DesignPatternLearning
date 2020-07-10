package Command.PostOffice;

import Command.PostOffice.command.IPost;
import Command.PostOffice.command.Post;
import Command.PostOffice.invoker.Invoker;
import Command.PostOffice.receiver.Receiver;

public class Client {
    public static void main(String[] args) {
        // 创建一个收信人对象实例
        Receiver receiver = new Receiver();
        // 创建一个邮局对象实例, 传入收信人对象实例
        IPost post = new Post(receiver);
        // 创建一个发信人对象实例, 传入邮局对象实例
        Invoker invoker = new Invoker();
        // 设置邮局
        invoker.setPost(post);
        // 发信人开始发送信息
        invoker.postMail("你好, 好久不见, 最近工作忙吗?");
    }
}
