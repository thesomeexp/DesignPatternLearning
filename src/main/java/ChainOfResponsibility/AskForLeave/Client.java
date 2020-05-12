package ChainOfResponsibility.AskForLeave;

import ChainOfResponsibility.AskForLeave.pojo.IStudent;
import ChainOfResponsibility.AskForLeave.pojo.Student;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        // 获得外观对象
        ProcessHandler processHandler = ProcessHandler.getInstance();

        // 创建随机数对象, 用来随机产生学生对象
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            // 获得随机数
            int radom = random.nextInt(3);
            IStudent student = new Student(radom, "学生" + i + "生" +
                    radom + "病了");
            System.out.println("############################");
            processHandler.sendMessage(student);
            System.out.println("############################");
        }

    }
}
