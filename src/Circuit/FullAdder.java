package Circuit;

import ComptationalGraph.Component;
import ComptationalGraph.Node;
import ComptationalGraph.Placeholder;
import Gates.And;
import Gates.Or;
import Gates.Xor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FullAdder implements Component {
    private Node x;
    private Node y;
    private Node carryIn;

    public FullAdder(Placeholder x, Placeholder y, Placeholder carryIn) {
        this.x = x;
        this.y = y;
        this.carryIn = carryIn;
    }
    @Override
    public Map<String, Node> run() {
        Map<String, Node> outputs = new HashMap<>();
        HalfAdder halfAdder1 = new HalfAdder(x, y);
        Map<String, Node> output1 = halfAdder1.run();
        HalfAdder halfAdder2 = new HalfAdder(carryIn, output1.get("sum"));
        Map<String, Node> output2 = halfAdder2.run();

        Or or1 = new Or(output2.get("carry"), output1.get("carry"));
        outputs.put("sum", output2.get("sum"));
        outputs.put("carry", or1);
        return outputs;
//        List<Node> output1 = halfAdder1.run();

    }
}
