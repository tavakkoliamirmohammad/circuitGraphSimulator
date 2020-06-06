package Circuit;

import ComptationalGraph.Component;
import ComptationalGraph.Node;
import ComptationalGraph.Variable;

import java.util.HashMap;
import java.util.Map;

public class FourBitCounter implements Component {
    private Variable[] qbars;
    private Node clk;

    public FourBitCounter(Node clk) {
        this.clk = clk;
        qbars = new Variable[2];
        for (int i = 0; i < qbars.length; ++i) {
            qbars[i] = new Variable(false);
        }
    }


    @Override
    public Map<String, Node> run() {
        Map<String, Node> outputs = new HashMap<>();
        DFlipFlop dFlipFlop1 = new DFlipFlop(qbars[0], clk);
        DFlipFlop dFlipFlop2 = new DFlipFlop(qbars[1], qbars[0]);
        Map<String, Node> output1 = dFlipFlop1.run();
        Map<String, Node> output2 = dFlipFlop2.run();
        outputs.put("q0", output1.get("Q"));
        outputs.put("q1", output2.get("Q"));
        qbars[0].setValue(output1.get("QBar").getOutput());
        qbars[1].setValue(output2.get("QBar").getOutput());
        return outputs;
    }
}
