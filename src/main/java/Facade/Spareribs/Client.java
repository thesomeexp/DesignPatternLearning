package Facade.Spareribs;

import Facade.Spareribs.cooker.CookFacade;
import Facade.Spareribs.cooker.ICookFacade;

public class Client {
    public static void main(String[] args) {
        System.out.println("==== 开始做糖醋排骨咯...");
        ICookFacade cookFacade = new CookFacade();
        cookFacade.cookSpareribs();
        System.out.println("==== 糖醋排骨制作完成!");
    }
}
