package Facade.Spareribs.base;
/**
 * 糖醋排骨接口
 * @author i
 *
 */
public interface ISpareribs {
    // 准备材料
    public void prepair();
    
    // 腌制排骨
    public void preserve();
    
    // 炸排骨
    public void fry();
    
    // 调汁
    public void juice();
}
