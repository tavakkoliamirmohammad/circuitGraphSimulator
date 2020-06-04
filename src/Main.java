import Circuit.FullAdder;
import ComptationalGraph.Graph;
import ComptationalGraph.Node;
import ComptationalGraph.Placeholder;
import ComptationalGraph.Session;
import Gates.And;
import Gates.Xor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Graph.createGraph();

        Placeholder x = new Placeholder();
        Placeholder y = new Placeholder();
        Placeholder cin = new Placeholder();
        FullAdder fullAdder = new FullAdder(x, y, cin);

        Session session = new Session();
        Map<Placeholder, Boolean> booleanMap = new HashMap<>();
        booleanMap.put(x, true);
        booleanMap.put(y, false);
        booleanMap.put(cin, true);
        List<Node> operations = new ArrayList<>(fullAdder.run().values());
        List<Boolean> outputs = session.run(operations, booleanMap);
        for (boolean res: outputs){
            System.out.println(res);
        }
    }
}
