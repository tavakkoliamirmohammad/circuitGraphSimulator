package ComptationalGraph;

import ComptationalGraph.Graph;
import ComptationalGraph.Node;

public class Variable extends Node {

    private boolean value;

    public Variable(boolean value) {
        super();
        this.value = value;
        Graph.defaultGraph.addVariable(this);
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
