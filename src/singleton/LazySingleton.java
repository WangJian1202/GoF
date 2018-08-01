package singleton;

/**
 * 懒汉单例，调用的时候创建类的实例，为了保证多线程下线程安全，所以加synchronized
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }
    public static synchronized LazySingleton getInstance(){
        if(lazySingleton==null){
            return new LazySingleton();
        }else{
            return lazySingleton;
        }
    }
}
