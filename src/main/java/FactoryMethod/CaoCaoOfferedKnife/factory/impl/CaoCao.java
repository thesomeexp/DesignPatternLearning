package FactoryMethod.CaoCaoOfferedKnife.factory.impl;

import FactoryMethod.CaoCaoOfferedKnife.factory.ISwordFactory;
import FactoryMethod.CaoCaoOfferedKnife.model.AbstractSword;
import FactoryMethod.CaoCaoOfferedKnife.model.sword.QiXingSword;

/**
 * 曹操实现工厂, 它能生产七星宝刀
 * @author someexp
 *
 */
public class CaoCao implements ISwordFactory{

    public AbstractSword createSword() {
        // TODO Auto-generated method stub
        return new QiXingSword();
    }
    
}
