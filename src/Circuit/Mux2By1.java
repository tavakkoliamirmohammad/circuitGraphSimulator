package Circuit;

import ComptationalGraph.Component;
import ComptationalGraph.Node;
import Gates.And;
import Gates.Not;
import Gates.Or;

import java.util.HashMap;
import java.util.Map;

public class Mux2By1 implements Component {

    private Node x;
    private Node y;
    private Node s;

    public Mux2By1(Node x, Node y, Node s) {
        this.x = x;
        this.y = y;
        this.s = s;
    }

    @Override
    public Map<String, Node> run() {
        Map<String, Node> outputs = new HashMap<>();
        Not notS = new Not(s);
        And xAndSnot = new And(x, notS);
        And yAndS = new And(y, s);
        Or result = new Or(yAndS, xAndSnot);
        outputs.put("result", result);
        return outputs;
    }
}
