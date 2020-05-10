package Proxy.SimpleDynamic;

import Proxy.SimpleDynamic.dao.ITarget;
import Proxy.SimpleDynamic.dao.TargetImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ITargetHandler implements InvocationHandler  {

    private ITarget iTarget = new TargetImpl();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        before();
        iTarget.operate();
        after();
        return null;
    }

    public void before(){
        System.out.println("before method");
    }

    public void after(){
        System.out.println("after method");
    }
}
