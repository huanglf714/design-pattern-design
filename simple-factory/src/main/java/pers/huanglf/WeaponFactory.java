package pers.huanglf;

/**
 * @className:WeaponFactory
 * @author:huanglf714
 * @create:2019/7/1 18:47
 * @decription:简单工厂模式，客户端不需要知道对象产生的实际过程，甚至连类名都不用知道，只需要知道一些参数即可
 * 优点：将对象的生产与运用分离，客户端任务减轻
 * 缺点：
 * 1、工厂类较为繁琐，有多个if或者switch判断
 * 2、当要增加新的类时，工厂类需要修改，不符合开闭原则
 **/
public class WeaponFactory {

    public Weapon createWeapon(String name){
        Weapon weapon = null;
        switch (name){
            case "sword":
                weapon = new Sword();
                break;
            case "spear":
                weapon = new Spear();
                break;
            case "axe":
                weapon = new Axe();
        }
        return weapon;
    }
}
