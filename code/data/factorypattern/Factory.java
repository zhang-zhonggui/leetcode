package data.factorypattern;

/**
 * @author zzgcn
 */
public class Factory {

    public static Animal createFactory(String type) {
        if (type == null || type.trim().isEmpty()) {
            return new People();
        }
        return switch (type.toLowerCase()) {
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            default -> throw new IllegalArgumentException("目前不支持类型: " + type);
        };
    }

}