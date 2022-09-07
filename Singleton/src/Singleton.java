/**
 * @name: Singleton
 * @author: yoga
 * @create: 2022-09-06 16:06
 **/
public class Singleton {


    //其他有用的实例化的变量
    private Singleton(){}


    //同步getInstance()方法，会降低性能
    private static Singleton uniqueInstance;
    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }

    //急切实例化
    public static Singleton instance = new Singleton();

    //双重检查加锁(不适用于1.4以及更早版本的Java)
    //volatile关键词确保当uniqueInstance变量被初始化成Singleton实例时，
    // 多个线程正确地处理uniqueInstance变量
    private volatile static Singleton singleton;
    public static  Singleton getSingleton(){
        if(singleton == null){//检查实例，如果不存在，就进入同步区块。
            // 注：只有第一次才彻底执行这里的代码。
            synchronized (Singleton.class){
                if(singleton == null){//进入区块后，再检查一次，如果仍然是null，才创建实例
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
