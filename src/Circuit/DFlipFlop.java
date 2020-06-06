package Circuit;

import ComptationalGraph.Component;
import ComptationalGraph.Node;
import ComptationalGraph.Variable;

import java.util.Map;

public class DFlipFlop implements Component {

    private Node d;
    private Node clk;
    private Variable q;
    private Variable qBar;

    public DFlipFlop(Node d, Node clk) {
        this.d = d;
        this.clk = clk;
        q = new Variable(false);
        qBar = new Variable(true);
    }

    @Override
    public Map<String, Node> run() {
        DFlipFlopCell dFlipFlopCell = new DFlipFlopCell(clk, d, q, qBar);
        Map<String, Node> output = dFlipFlopCell.run();
        q.setValue(output.get("Q").getOutput());
        qBar.setValue(output.get("QBar").getOutput());
        return output;
    }
}
