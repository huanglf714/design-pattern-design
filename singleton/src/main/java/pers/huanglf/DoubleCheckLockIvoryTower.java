package pers.huanglf;

/**
 * @className:DoubleLockIvoryTower
 * @author:huanglf714
 * @create:2019/7/1 16:39
 * @decription:用synchronzied来控制多线程并发问题，两次判断instance是否为空
 **/
public class DoubleCheckLockIvoryTower {
    private static DoubleCheckLockIvoryTower instance;
    private static Object object = new Object();

    private DoubleCheckLockIvoryTower(){}

    public static DoubleCheckLockIvoryTower getInstance(){
        //the first check
        if(instance==null){
            synchronized (object){
                //the second check
                if(instance==null){
                    instance = new DoubleCheckLockIvoryTower();
                }
            }
        }
        return instance;
    }

}
