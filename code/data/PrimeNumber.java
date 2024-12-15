package data;

/**
 * @author zhang
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int limit = 10000;
        System.out.println("10000以内的所有素数：");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    /**
     * 判断是否是素数
     *
     * @param number 数组
     * @return 是否是素数
     */
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
