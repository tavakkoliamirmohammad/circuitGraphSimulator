package ComptationalGraph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Operation> operations;
    private List<Placeholder> placeholders;
    private List<Variable> variables;
    private List<Constant> constants;

    public static Graph defaultGraph;

    public Graph() {
        this.operations = new ArrayList<>();
        this.placeholders = new ArrayList<>();
        this.constants = new ArrayList<>();
        this.variables = new ArrayList<>();
    }

    public static void createGraph() {
        defaultGraph = new Graph();
    }

    public void addOperation(Operation operation) {
        operations.add(operation);
    }

    public void addPlaceholder(Placeholder placeholder) {
        placeholders.add(placeholder);
    }

    public void addVariable(Variable variable) {
        variables.add(variable);
    }

    public void addConstant(Constant constant) {
        constants.add(constant);
    }

}
