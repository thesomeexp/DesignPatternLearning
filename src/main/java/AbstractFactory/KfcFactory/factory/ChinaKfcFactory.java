package AbstractFactory.KfcFactory.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import AbstractFactory.KfcFactory.model.Beverage;
import AbstractFactory.KfcFactory.model.ChickenWings;
import AbstractFactory.KfcFactory.model.FrenchFries;
import AbstractFactory.KfcFactory.model.Hamburg;
import AbstractFactory.KfcFactory.model.kfc.ChinaFrenchFries;
import AbstractFactory.KfcFactory.model.kfc.ChinaHamburg;
import AbstractFactory.KfcFactory.model.kfc.ColaBeverage;
import AbstractFactory.KfcFactory.model.kfc.OrleansChickenWings;


/**
 * 这是一家具体的工厂
 * @author someexp
 *
 */
public class ChinaKfcFactory implements IKfcFactory{

    public Hamburg createHamburg(int num) {
        // TODO Auto-generated method stub
        return new ChinaHamburg(num);
    }

    public FrenchFries createFrenchFries(int num) {
        // TODO Auto-generated method stub
        return new ChinaFrenchFries(num);
    }

    public ChickenWings createChickenWings(int num) {
        // TODO Auto-generated method stub
        return new OrleansChickenWings(num);
    }

    public Beverage createBeverage(int num) {
        // TODO Auto-generated method stub
        return new ColaBeverage(num);
    }
    
}
