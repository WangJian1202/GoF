package singleton;

/**
 * 占位符 线程安全
 */
public class LazyInitHolderSingleton {

    private LazyInitHolderSingleton() {
    }

    private static class SingletonHolder{
        private static final LazyInitHolderSingleton INSTANCE =new LazyInitHolderSingleton();
    }

    private static LazyInitHolderSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
