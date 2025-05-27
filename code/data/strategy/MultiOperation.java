package data.strategy;

public class MultiOperation implements Operation {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
