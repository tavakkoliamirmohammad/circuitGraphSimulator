package Circuit;

import ComptationalGraph.Component;
import ComptationalGraph.Node;
import Gates.And;
import Gates.Xor;

import java.util.HashMap;
import java.util.Map;

public class HalfAdder implements Component {
    private Node x;
    private Node y;

    public HalfAdder(Node x, Node y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Map<String, Node> run() {
        Map<String, Node> nodes = new HashMap<>();
        Node sum = new Xor(x, y);
        Node carry = new And(x, y);
        nodes.put("sum", sum);
        nodes.put("carry", carry);
        return nodes;
    }
}
