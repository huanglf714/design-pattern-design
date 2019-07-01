package pers.huanglf;

/**
 * 运用枚举的特性,枚举可看成是类，它既可以有成员属性，又可以有成员方法
 * 非懒加载
**/
public enum EnumIvoryTower {
    INSTANCE;

    public String  doSomething(){
       return "9999999999";
    }
}
