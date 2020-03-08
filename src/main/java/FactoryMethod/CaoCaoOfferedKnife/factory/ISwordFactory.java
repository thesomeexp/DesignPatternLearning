package FactoryMethod.CaoCaoOfferedKnife.factory;

import FactoryMethod.CaoCaoOfferedKnife.model.AbstractSword;

/**
 * 一个武器工厂, 它能生产抽象武器
 * @author someexp
 *
 */
public interface ISwordFactory {
    public AbstractSword createSword();
}
