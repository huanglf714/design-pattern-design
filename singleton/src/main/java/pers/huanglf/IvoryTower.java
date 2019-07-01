package pers.huanglf;

/**
 * @className:IvoryTower
 * @author:huanglf714
 * @create:2019/7/1 16:25
 * @decription:饿汉式单例模式实现：类加载之初就new出实例对象
 * 优点：线程安全
 * 缺点：初始时无论要不要用到就加载资源，可能会造成资源浪费
 *
 *
 **/
public class IvoryTower {
    public static IvoryTower instance = new IvoryTower();

    private IvoryTower(){}

    public static IvoryTower getInstance() {
        return instance;
    }
}
