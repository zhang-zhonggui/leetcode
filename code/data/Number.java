package data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 做一道数学题，从100开始，交替乘以上一个数的1.5和0.75，如果低于100或者高于200则乘以2或者除以2让数列保持在100到200之间，
 * 如前4个为100 150 112.5 168.75 ... 请列出这个数列13个。评论区有100个人列出，视频必做哪怕简陋一点，立帖为证。
 */
public class Number {
    /**
     * @param n     起始数
     * @param count 个数
     * @return
     */

    private static List<BigDecimal> getNumbers(BigDecimal n, int count) {
        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(n);
        for (int i = 0; i < count; i++) {
            //交替乘以上一个数的1.5和0.75
            if (i % 2 == 0) {
                n = n.multiply(BigDecimal.valueOf(1.5));
            } else {
                n = n.multiply(BigDecimal.valueOf(0.75));
            }
            //如果低于100或者高于200则乘以2或者除以2让数列保持在100到200之间
            if (n.compareTo(BigDecimal.valueOf(100)) < 1) {
                n = n.multiply(BigDecimal.valueOf(2));
                numbers.add(n);
                continue;
            }
            if (n.compareTo(BigDecimal.valueOf(200)) > -1) {
                n = n.divide(BigDecimal.valueOf(2));
                numbers.add(n);
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        List<BigDecimal> list = getNumbers(new BigDecimal(100), 13);
        System.out.println(list);
    }

}
