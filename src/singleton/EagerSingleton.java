package singleton;

/**
 * 饿汉单例模式，在类初始化的时候创建实例，线程安全
 */
public class EagerSingleton {

    private static EagerSingleton eagerSingleton =new EagerSingleton();

    private EagerSingleton() {

    }
    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }

}
