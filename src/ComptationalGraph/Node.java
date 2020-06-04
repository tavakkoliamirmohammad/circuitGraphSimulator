package ComptationalGraph;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {

    protected List<Node> consumers;
    protected List<Boolean> inputs;
    private boolean output;

    public Node() {
        this.consumers = new ArrayList<>();
    }

    public boolean getOutput() {
        return output;
    }

    public void setOutput(boolean output) {
        this.output = output;
    }

    public List<Boolean> getInputs() {
        return inputs;
    }

    public void setInputs(List<Boolean> inputs) {
        this.inputs = inputs;
    }

    public boolean getInput(int index){
        return this.inputs.get(index);
    }

}
