package pers.huanglf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {

        //饿汉式-线程安全
        IvoryTower instance1 = IvoryTower.getInstance();
        IvoryTower instance2 = IvoryTower.getInstance();
        logger.info((instance1==instance2)+"");
        //懒汉式-线程不安全
        LazyIvoryTower instance3 = LazyIvoryTower.getInstance();
        LazyIvoryTower instance4 = LazyIvoryTower.getInstance();
        logger.info((instance3==instance4)+"");
        //双重检验-线程安全
        DoubleCheckLockIvoryTower instance5 = DoubleCheckLockIvoryTower.getInstance();
        DoubleCheckLockIvoryTower instance6 = DoubleCheckLockIvoryTower.getInstance();
        logger.info((instance5==instance6)+"");
        //静态内部类
        StaticInnerClassIvoryTower instance7 = StaticInnerClassIvoryTower.getInstance();
        StaticInnerClassIvoryTower instance8 = StaticInnerClassIvoryTower.getInstance();
        logger.info((instance7==instance8)+"");
        //枚举类
        EnumIvoryTower instance9 = EnumIvoryTower.INSTANCE;
        EnumIvoryTower instance10 = EnumIvoryTower.INSTANCE;
        logger.info((instance9==instance10)+"");
        logger.info(instance9.doSomething());


    }
}
