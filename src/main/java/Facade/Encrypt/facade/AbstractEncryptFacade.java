package Facade.Encrypt.facade;

/**
 * 抽象加密类外观
 * @author i
 *
 */
public abstract class AbstractEncryptFacade {
    public abstract void fileEncrypt(String fileNameSrc, String fileNameDes);   
}