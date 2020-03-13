package Builder.MobilePackage.pojo;
/**
 * 手机套餐
 * @author someexp
 *
 */
public class MobilePackage {
    // 话费
    private int money;
    // 短信
    private int shortInfo;
    // 彩铃
    private String music;
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getShortInfo() {
        return shortInfo;
    }
    public void setShortInfo(int shortInfo) {
        this.shortInfo = shortInfo;
    }
    public String getMusic() {
        return music;
    }
    public void setMusic(String music) {
        this.music = music;
    }
    
}
