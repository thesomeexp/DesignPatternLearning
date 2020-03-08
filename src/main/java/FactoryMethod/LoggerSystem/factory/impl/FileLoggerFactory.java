package FactoryMethod.LoggerSystem.factory.impl;

import FactoryMethod.LoggerSystem.factory.LoggerFactory;
import FactoryMethod.LoggerSystem.model.Logger;
import FactoryMethod.LoggerSystem.model.impl.FileLogger;

// 文件日志记录器工厂类，充当具体工厂角色
public class FileLoggerFactory implements LoggerFactory{

    public Logger createLogger() {
        // TODO Auto-generated method stub
        return new FileLogger();
    }
    
}
