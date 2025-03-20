package data.factorypattern;

/**
 * @author zzgcn
 */
public class Factory {


    public static Animal createFactory(String type) {
        if (type == null || type.isBlank()) {
            return new People();
        }
        if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        } else if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else {
            throw new IllegalArgumentException("目前不支持" + type);
        }
    }

}
