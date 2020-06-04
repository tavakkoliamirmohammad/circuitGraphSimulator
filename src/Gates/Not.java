package Gates;

import ComptationalGraph.Node;
import ComptationalGraph.UnaryOperation;

public class Not extends UnaryOperation {
    public Not(Node x) {
        super(x);
    }

    @Override
    protected boolean compute(boolean x) {
        return !x;
    }
}
