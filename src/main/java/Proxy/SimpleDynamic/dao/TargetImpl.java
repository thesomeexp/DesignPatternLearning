package Proxy.SimpleDynamic.dao;

public class TargetImpl implements ITarget{
    @Override
    public void operate() {
        System.out.println("TargetImpl具体的操作");
    }
}
