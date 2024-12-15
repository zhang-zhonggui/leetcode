package data;

/**
 * @Author zzg
 */ // 定义一个单例类
public class Singleton {
    // 定义一个私有构造函数
    private Singleton() {
    }

    // 定义一个静态的final变量
    private static final Singleton SINGLETON = new Singleton();

    // 定义一个获取实例的方法
    public static Singleton getInstance() {
        return SINGLETON;
    }

}