package data.factorypattern;

public class Demo {
    public static void main(String[] args) {
        Animal animal = Factory.createFactory(null);
        animal.eat();
    }
}
