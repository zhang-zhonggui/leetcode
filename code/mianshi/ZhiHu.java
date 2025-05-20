package mianshi;

import java.util.ArrayList;

/**
 * 计算指点班级的平均分
 */
public class ZhiHu {

    public static void main(String[] args) {
        System.out.println(ZhiHu.averageScore("1班"));
    }
    private static Double averageScore(String className){
        Grade one = new Grade();
        one.className = "1班";
        one.score = 100;
        Grade two = new Grade();
        two.className = "1班";
        two.score = 66;
        Grade three = new Grade();
        three.className = "1班";
        three.score = 98;
        ArrayList<Grade> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        double score = list.stream().filter(data -> data.className.equals(className)).map(map -> map.score)
                .mapToInt(data -> data).average().orElse(0);

        return score;
    }


}
