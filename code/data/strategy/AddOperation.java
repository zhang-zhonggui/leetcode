package data.strategy;

public class AddOperation implements Operation{
    @Override
    public int execute(int a, int b) {
        return a  + b;
    }
}
