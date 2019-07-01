package pers.huanglf;

/**
 * @className:StaticInnerClassIvoryTower
 * @author:huanglf714
 * @create:2019/7/1 16:49
 * @decription:静态内部类实现
 * 因为类只会加载一次，所以instance作为static变量只会在类加载的时候加载
 * 其他线程访问时，会直接去虚拟机的方法区拿，而不用new
 * 优点：兼顾了懒汉式的内存优化（使用时才初始化），又保证了线程的安全性
 * 缺点：需要多加载一个类，且这个实例只能通过JVM控制，不能手动destroy
 **/
public class StaticInnerClassIvoryTower {
    private StaticInnerClassIvoryTower(){}

    public static StaticInnerClassIvoryTower getInstance(){
        return SingletonHolder.instance;
    }

    private static class SingletonHolder{
        private static StaticInnerClassIvoryTower instance = new StaticInnerClassIvoryTower();
    }
}
