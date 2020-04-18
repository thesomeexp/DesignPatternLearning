package Singleton.Method1.pojo;
/**
 * 单例设计模式方法1
 * @author i
 *
 */
public class Singleton {
    // 类共享的实例对象
    private static Singleton singleton = null;
    // 私有构造方法, 使其无法被new
    private Singleton() {
        System.out.println("private Constructor");
    }
    // 获得单例方法(锁方法)
//  public synchronized static Singleton getInstance() {
//      // 判断是否为空
//      if (singleton == null) {
//          singleton = new Singleton();
//      }
//      return singleton;
//  }
    
    // (锁代码段)
//  public synchronized static Singleton getInstance() {
//      if (singleton == null) {
//          synchronized (Singleton.class) {
//              singleton = new Singleton();
//          }
//      }
//      return singleton;
//  }
    
    // (锁方法和代码段)Double-Check Locking
    public synchronized static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
