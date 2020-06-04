package Gates;

import ComptationalGraph.Node;
import ComptationalGraph.Operation;

public class Or extends Operation {
    public Or(Node x, Node y) {
        super(x, y);
    }

    @Override
    public boolean compute(boolean x, boolean y) {
        return x || y;
    }
}
