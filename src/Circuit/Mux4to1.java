package Circuit;

import ComptationalGraph.Component;
import ComptationalGraph.Node;

import java.util.Map;

public class Mux4to1 implements Component {
    Node[] nodes;
    Node[] s;

    public Mux4to1(Node[] nodes, Node[] s) {
        this.nodes = nodes;
        this.s = s;
    }

    @Override
    public Map<String, Node> run() {
        Mux2By1 mux2By1_1 = new Mux2By1(nodes[0], nodes[1], s[1]);
        Mux2By1 mux2By1_2 = new Mux2By1(nodes[2], nodes[3], s[1]);
        Mux2By1 mux2By1_3 = new Mux2By1(mux2By1_1.run().get("result"), mux2By1_2.run().get("result"), s[0]);
        return mux2By1_3.run(); // a map with result as key
    }

}
