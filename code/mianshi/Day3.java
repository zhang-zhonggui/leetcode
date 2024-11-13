package mianshi;



import java.util.ArrayList;

public class Day3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 18));
        list.add(new Student("李四", 17));
        list.add(new Student("王五", 16));
        //使用jdk8的stream求年龄平均值
        double avgAge = list.stream().mapToInt(Student::getAge).average().orElse(-1);
        System.out.println(avgAge);
    }
}
