package data;

/**定义一个单例类
 * @author zzgcn
 */
public class Singleton {


    private Singleton() {

    }
    private static  Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}