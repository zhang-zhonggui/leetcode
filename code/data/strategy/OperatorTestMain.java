package data.strategy;

import java.util.Optional;

public class OperatorTestMain {

    public static void main(String[] args) {
        //获取计算的目标实现类
        Optional<Operation> targetOperation = OperatorFactory.getOperation("a");
        int result = targetOperation.get().execute(1, 2);

        System.out.println("result:" +  result);
    }
}