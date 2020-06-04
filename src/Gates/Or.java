package Gates;

import ComptationalGraph.BinaryOperation;
import ComptationalGraph.Node;

public class Or extends BinaryOperation {
    public Or(Node x, Node y) {
        super(x, y);
    }

    @Override
    public boolean compute(boolean x, boolean y) {
        return x || y;
    }
}
