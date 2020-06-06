import Circuit.FullAdder;
import Circuit.Mux4to1;
import ComptationalGraph.Graph;
import ComptationalGraph.Node;
import ComptationalGraph.Placeholder;
import ComptationalGraph.Session;
import Gates.And;
import Gates.Xor;

import java.lang.reflect.Array;
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
        outputs = session.run(operations, booleanMap);
        for (boolean res: outputs){
            System.out.println(res);
        }
//        Placeholder[] x = {new Placeholder(), new Placeholder(), new Placeholder(), new Placeholder()};
//        Placeholder[] s = {new Placeholder(), new Placeholder()};
//        Mux4to1 mux4to1 = new Mux4to1(x, s);
//        Session session = new Session();
//        Map<Placeholder, Boolean> booleanMap = new HashMap<>();
//        Boolean[] xValue = {false, true, false, false};
//        Boolean[] sValue = {false, false};
//        for (int index = 0; index < 4; ++index) {
//            booleanMap.put(x[index], xValue[index]);
//        }
//        for (int index = 0; index < 2; ++index) {
//            booleanMap.put(s[index], sValue[index]);
//        }
//
//        List<Node> operations = new ArrayList<>(mux4to1.run().values());
//        List<Boolean> outputs = session.run(operations, booleanMap);
//        for (boolean res : outputs) {
//            System.out.println(res);
//        }
    }
}
