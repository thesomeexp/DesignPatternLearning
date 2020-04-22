package Facade.Encrypt.facade;

import Facade.Encrypt.base.FileReader;
import Facade.Encrypt.base.FileWriter;
import Facade.Encrypt.base.NewCipherMachine;

public class NewEncryptFacade extends AbstractEncryptFacade{
    private FileReader reader;
    private NewCipherMachine cipher;
    private FileWriter writer;
    
    public NewEncryptFacade() {
        reader = new FileReader();
        cipher = new NewCipherMachine();
        writer = new FileWriter();
    }
    
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr,fileNameDes);
    }

}
