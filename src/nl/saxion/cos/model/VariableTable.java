package nl.saxion.cos.model;

import java.util.HashMap;
import java.util.Locale;

public class VariableTable
{
    private int nextIndex = 0;

    private final HashMap<String, Variable> symbols;
    private VariableTable parentScope;

    public VariableTable(int offset)
    {
        this.nextIndex = offset;
        this.symbols = new HashMap<>();
    }

    /**
     *
     * @param name to lookup
     * @return if found return the variable
     */
    public Variable lookUp(String name)
    {
        Variable variable = symbols.get(name);
        if (variable == null && parentScope != null)
            variable = parentScope.lookUp(name);

        return variable;
    }

    /**
     * Add variable to hashmap
     * @param name IDENTIFIER
     * @param type Variable Type
     */
    public void add(String name, DataType type)
    {
        nextIndex++;
        symbols.put(name, new Variable(name, type, nextIndex));
    }
    /**
     * Add variable to hashmap
     * @param name IDENTIFIER
     * @param type Variable Type
     * @param index Index stored in the locals table
     */
    public void add(String name, DataType type, int index)
    {
        nextIndex++;
        symbols.put(name, new Variable(name, type, index));
    }

    public VariableTable openScope()
    {
        VariableTable childScope = new VariableTable(nextIndex);
        childScope.parentScope = this;
        //childScope.nextIndex = nextIndex;
        return childScope;

    }

    public VariableTable getParentScope()
    {
        return parentScope;

    }

    public String getTypeLetter(String type)
    {
        switch (type.toLowerCase(Locale.ROOT))
        {
            case "numar":
                return "I";
            case "sdc":
                return "Ljava/lang/String;";
            case "automat":
            case "bool":
                return "Z";
            default:
                return "?";
        }
    }
}
