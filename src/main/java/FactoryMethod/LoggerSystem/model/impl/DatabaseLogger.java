package FactoryMethod.LoggerSystem.model.impl;

import FactoryMethod.LoggerSystem.model.Logger;
// 数据库日志记录器，充当具体产品角色
public class DatabaseLogger implements Logger{

    public void writeLog() {
        // TODO Auto-generated method stub
        System.out.println("数据库日志记录");
    }

}
