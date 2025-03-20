package data.factorypattern;

public class People implements Animal{
    @Override
    public void eat() {
        System.out.println("我在吃");
    }
}
