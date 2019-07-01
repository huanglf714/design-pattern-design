package pers.huanglf;

/**
 * @className:LazyIvoryTower
 * @author:huanglf714
 * @create:2019/7/1 16:35
 * @decription:懒汉式单例模式，只有客户端发起请求调用getInstance()方法时才分配实例
 * 优点：节约资源
 * 缺点：线程不安全
 **/
public class LazyIvoryTower {
    private static LazyIvoryTower instance = null;

    private LazyIvoryTower(){}

    public static LazyIvoryTower getInstance(){
        if(instance==null){
            instance = new LazyIvoryTower();
        }
        return instance;
    }
}
