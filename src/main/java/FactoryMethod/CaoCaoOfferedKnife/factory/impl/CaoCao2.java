package FactoryMethod.CaoCaoOfferedKnife.factory.impl;

import FactoryMethod.CaoCaoOfferedKnife.factory.ISwordFactory;
import FactoryMethod.CaoCaoOfferedKnife.model.AbstractSword;
import FactoryMethod.CaoCaoOfferedKnife.model.sword.BaXingSword;
/**
 * 曹操2能生产八星宝刀
 * @author someexp
 *
 */
public class CaoCao2 implements ISwordFactory{

    public AbstractSword createSword() {
        // TODO Auto-generated method stub
        return new BaXingSword();
    }

}
