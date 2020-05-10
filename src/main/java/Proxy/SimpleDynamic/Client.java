package Proxy.SimpleDynamic;

import Proxy.SimpleDynamic.dao.ITarget;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        // 真实处理对象
        InvocationHandler handler = new ITargetHandler();
        // 创建代理类实例对象
        ITarget target = (ITarget) Proxy.newProxyInstance(
                ITarget.class.getClassLoader(),
                new Class[]{ITarget.class},
                handler
                );
        target.operate();
    }
}
