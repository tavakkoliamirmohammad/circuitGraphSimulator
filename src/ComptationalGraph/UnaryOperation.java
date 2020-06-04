package ComptationalGraph;

import java.util.List;

public abstract class UnaryOperation extends Operation {

    public UnaryOperation(Node x){
        super(x);
    }

    protected abstract boolean compute(boolean x);

    @Override
    public boolean computeOutput(List<Boolean> inputs) {
        return compute(inputs.get(0));
    }
}
