package Facade.Encrypt.base;

/**
 * 模拟读取文件
 * @author i
 *
 */
public class FileReader {

    public String read(String fileNameSrc) {
        System.out.println("模拟读取文件" + fileNameSrc);
        return fileNameSrc;
    }
    
}
