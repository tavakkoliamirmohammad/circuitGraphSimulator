package Circuit;

import ComptationalGraph.Component;
import ComptationalGraph.Node;
import Gates.Nand;
import Gates.Not;

import java.util.HashMap;
import java.util.Map;

public class DFlipFlopCell implements Component {

    private Node clk;
    private Node d;
    private Node q;
    private Node qBar;

    public DFlipFlopCell(Node clk, Node d, Node q, Node qBar) {
        this.clk = clk;
        this.d = d;
        this.q = q;
        this.qBar = qBar;
    }

    @Override
    public Map<String, Node> run() {
        Map<String, Node> outputs = new HashMap<>();
        Nand nand1 = new Nand(d, clk);
        Not notD = new Not(d);
        Nand nand2 = new Nand(notD, clk);
        Nand nand3 = new Nand(nand1, qBar);
        Nand nand4 = new Nand(nand2, q);
        outputs.put("Q", nand3);
        outputs.put("QBar", nand4);
        return outputs;
    }
}
