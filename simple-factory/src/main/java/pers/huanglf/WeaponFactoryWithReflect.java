package pers.huanglf;

/**
 * @className:WeaponFactoryWithReflect
 * @author:huanglf714
 * @create:2019/7/1 19:13
 * @decription:根据反射动态的判断生成对象
 * 避免了要修改工厂代码
 **/
public class WeaponFactoryWithReflect {
    public Weapon createWeapon(String name) {
        try {
            Weapon weapon = (Weapon) Class.forName(name).newInstance();
            return weapon;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
