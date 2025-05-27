package data;

/**
 * 定义一个单例类
 *
 * @author zzgcn
 */
public class Singleton {


    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {

    }

}