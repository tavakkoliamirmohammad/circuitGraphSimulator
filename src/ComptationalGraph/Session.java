package ComptationalGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Session {

    public List<Boolean> run(List<Node> operations, Map<Placeholder, Boolean> feed) {
        List<Boolean> outputs = new ArrayList<>();
        for (Node operation : operations) {
            List<Node> nodePostOrder = traversePostOrder(operation);

            for (Node node : nodePostOrder) {
                if (node instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) node;
                    placeholder.setOutput(feed.get(placeholder));
                } else if (node instanceof Variable) {
                    Variable variable = (Variable) node;
                    variable.setOutput(variable.getValue());
                } else {
                    Operation op = (Operation) node;
                    List<Boolean> nodeOutput = new ArrayList<>();
                    for (Node inputNode : op.inputNodes) {
                        nodeOutput.add(inputNode.getOutput());
                    }
                    op.setInputs(nodeOutput);
                    op.setOutput(op.computeOutput(op.getInputs()));
                }
            }
            outputs.add(operation.getOutput());
        }
        return outputs;
    }

    private List<Node> traversePostOrder(Node node) {
        List<Node> nodePostOrder = new ArrayList<>();
        recurse(nodePostOrder, node);
        return nodePostOrder;
    }

    private void recurse(List<Node> nodes, Node node) {
        if (node instanceof Operation) {
            Operation operation = (Operation) node;
            for (Node inputNode : operation.inputNodes) {
                recurse(nodes, inputNode);
            }
        }
        nodes.add(node);
    }
}
