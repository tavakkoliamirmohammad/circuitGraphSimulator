package Gates;

import ComptationalGraph.Node;
import ComptationalGraph.Operation;

public class And extends Operation {

    public And(Node x, Node y) {
        super(x, y);
    }

    @Override
    public boolean compute(boolean x, boolean y) {
        return x && y;
    }
}
