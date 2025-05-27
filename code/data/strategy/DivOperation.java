package data.strategy;

public class DivOperation implements Operation {
    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}
