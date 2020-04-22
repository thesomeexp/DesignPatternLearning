package Facade.Encrypt.facade;

import Facade.Encrypt.base.CipherMachine;
import Facade.Encrypt.base.FileReader;
import Facade.Encrypt.base.FileWriter;

public class EncryptFacade extends AbstractEncryptFacade{
    // 维持对其他对象的引用
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;
    
    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }
    
    // 调用其他对象的业务方法
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr,fileNameDes);
    }

}
