package FactoryMethod.LoggerSystem;

/**
 * 工厂方法模式
 * 工厂不生产具体的对象实例
 * 而是交由齐工厂子类生产
 * @author someexp
 *
 */
import FactoryMethod.LoggerSystem.factory.LoggerFactory;
import FactoryMethod.LoggerSystem.factory.impl.DatabaseLoggerFactory;
import FactoryMethod.LoggerSystem.factory.impl.FileLoggerFactory;
import FactoryMethod.LoggerSystem.model.Logger;

public class Client {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new FileLoggerFactory();
        Logger logger = loggerFactory.createLogger();
        logger.writeLog();
        
        LoggerFactory loggerFactory2 = new DatabaseLoggerFactory();
        Logger logger2 = loggerFactory2.createLogger();
        logger2.writeLog();
    }
}
