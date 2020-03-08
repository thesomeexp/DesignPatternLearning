package FactoryMethod.CaoCaoOfferedKnife.model;

import sun.launcher.resources.launcher;

/**
 * 需要生产的抽象剑
 * @author someexp
 *
 */
public abstract class AbstractSword {
    private String name;

    public AbstractSword() {
        // TODO Auto-generated constructor stub
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
