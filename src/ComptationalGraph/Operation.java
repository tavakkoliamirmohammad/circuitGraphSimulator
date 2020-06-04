package ComptationalGraph;

import ComptationalGraph.Graph;
import ComptationalGraph.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Operation extends Node {

    protected List<Node> inputNodes;

    public Operation(Node... inputNodes) {
        super();
        this.inputNodes = new ArrayList<>();
        this.inputNodes.addAll(Arrays.asList(inputNodes));
        for (Node input : this.inputNodes) {
            input.consumers.add(this);
        }
        Graph.defaultGraph.addOperation(this);
    }

    public abstract boolean compute(boolean x, boolean y);
}
