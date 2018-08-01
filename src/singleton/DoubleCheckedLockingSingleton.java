package singleton;

/**
 * 双检锁DCL 线程安全
 *
 *
 */
public class DoubleCheckedLockingSingleton {

    private volatile static DoubleCheckedLockingSingleton doubleCheckedLockingSingleton;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance(){
        DoubleCheckedLockingSingleton localRef = doubleCheckedLockingSingleton;
        if(doubleCheckedLockingSingleton == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                localRef=doubleCheckedLockingSingleton;
                if(localRef==null){
                    doubleCheckedLockingSingleton=localRef=new DoubleCheckedLockingSingleton();
                }
            }
        }
        return localRef;
    }
}
