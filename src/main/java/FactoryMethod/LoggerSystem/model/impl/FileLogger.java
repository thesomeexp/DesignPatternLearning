package FactoryMethod.LoggerSystem.model.impl;

import FactoryMethod.LoggerSystem.model.Logger;
// 文件日志记录器，充当具体产品角色
public class FileLogger implements Logger{

    public void writeLog() {
        // TODO Auto-generated method stub
        System.out.println("文件日志记录");
    }

}
