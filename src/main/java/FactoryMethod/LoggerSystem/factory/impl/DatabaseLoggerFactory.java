package FactoryMethod.LoggerSystem.factory.impl;

import FactoryMethod.LoggerSystem.factory.LoggerFactory;
import FactoryMethod.LoggerSystem.model.Logger;
import FactoryMethod.LoggerSystem.model.impl.DatabaseLogger;
//数据库日志记录器工厂类，充当具体工厂角色
public class DatabaseLoggerFactory implements LoggerFactory{

    public Logger createLogger() {
        // TODO Auto-generated method stub
        return new DatabaseLogger();
    }

}
