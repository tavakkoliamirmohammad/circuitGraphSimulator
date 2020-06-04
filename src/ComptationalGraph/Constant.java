package ComptationalGraph;

import ComptationalGraph.Graph;
import ComptationalGraph.Node;

public class Constant extends Node {

    private boolean value;

    public Constant(boolean value) {
        super();
        this.value = value;
        Graph.defaultGraph.addConstant(this);
    }

    public boolean getValue() {
        return value;
    }


}
