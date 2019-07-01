package pers.huanglf;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //基础简单工厂模式
        WeaponFactory weaponFactory = new WeaponFactory();
        Weapon weapon = weaponFactory.createWeapon("sword");
        System.out.println(weapon.toString() );
        //利用反射增强简单工厂模式
        WeaponFactoryWithReflect weaponFactoryWithReflect = new WeaponFactoryWithReflect();
        Properties properties = getPro();
        Weapon weapon2 = weaponFactoryWithReflect.createWeapon(properties.getProperty("sword"));
        System.out.println(weapon2.toString() );
    }

    /**
     * 读取配置文件
    **/
    static private Properties getPro(){
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream("E:\\CodingPractice\\design-pattern-java\\design-pattern-java\\simple-factory\\src\\main\\java\\pers\\huanglf\\weapon.properties"));
        }catch (Exception e){
            e.printStackTrace();
        }

        return pro;
    }
}
