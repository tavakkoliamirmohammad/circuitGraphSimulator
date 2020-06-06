package ComptationalGraph;

import java.util.List;

public abstract class BinaryOperation extends Operation {

    public BinaryOperation(Node x, Node y) {
        super(x, y);
    }

    public abstract boolean compute(boolean x, boolean y);

    @Override
    public boolean computeOutput(List<Boolean> inputs) {
        return compute(inputs.get(0), inputs.get(1));
    }
}
