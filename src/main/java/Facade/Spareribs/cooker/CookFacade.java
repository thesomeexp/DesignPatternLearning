package Facade.Spareribs.cooker;

import Facade.Spareribs.base.ISpareribs;
import Facade.Spareribs.base.Spareribs;

/**
 * 外观模式制作糖醋排骨
 * @author i
 *
 */
public class CookFacade implements ICookFacade {
    
    // 糖醋排骨排骨接口
    private final ISpareribs spareribs = new Spareribs(); 
    
    // 做糖醋排骨
    @Override
    public void cookSpareribs() {
        // 准备材料
        this.spareribs.prepair();
        // 腌制排骨
        this.spareribs.preserve();
        // 炸排骨
        this.spareribs.fry();
        // 调汁
        this.spareribs.juice();
    }

}
