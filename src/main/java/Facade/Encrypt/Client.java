package Facade.Encrypt;

import Facade.Encrypt.facade.AbstractEncryptFacade;
import Facade.Encrypt.facade.EncryptFacade;
import Facade.Encrypt.facade.NewEncryptFacade;

public class Client {
    public static void main(String[] args) {
        AbstractEncryptFacade ef;
        ef = new EncryptFacade();
        ef.fileEncrypt("Hello World!", "/output/encry.txt");
        System.out.println("==== 改变加密方法 ====");
        // 当改变交互的子系统时, 抽象外观类的优点显示出来
        ef = new NewEncryptFacade();
        ef.fileEncrypt("Hello World!", "/output/encry.txt");
        
    }
}
