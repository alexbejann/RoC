package nl.saxion.cos.model;

import java.util.HashMap;
import java.util.Locale;

public class VariableTable
{
    private final HashMap<String, Variable> symbols;
    private int nextIndex = 0;
    private VariableTable parentScope;

    public VariableTable(int offset)
    {
        this.nextIndex = offset;
        this.symbols = new HashMap<>();
    }

    /**
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
     * @param name to lookup
     * @return if found return the variable
     */
    public Variable lookUpLocal(String name)
    {
        return symbols.get(name);
    }

    /**
     * Add variable to hashmap
     *
     * @param name IDENTIFIER
     * @param type Variable Type
     */
    public void add(String name, DataType type)
    {
        symbols.put(name, new Variable(name, type, nextIndex));
        nextIndex++;
    }
    /**
     * Add variable to hashmap
     * @param name IDENTIFIER
     * @param type Variable Type
     * @param index Index stored in the locals table
     */
    public void add(String name, DataType type, int index)
    {
        symbols.put(name, new Variable(name, type, index));
        nextIndex++;
    }

    // openScope(), 'openFunctionScope()' and 'openFunctionScope()' are convenience methods.
    public VariableTable openMethodScope()
    {
        return createScope(0);
    }

    public VariableTable openScope()
    {
        return createScope(nextIndex);
    }

    private VariableTable createScope(int offset)
    {
        VariableTable childScope = new VariableTable(offset);
        childScope.parentScope = this;
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
            case "scurt":
            case "numar":
                return "I";
            case "sdc":
                return "Ljava/lang/String;";
            case "bool":
                return "Z";
            default:
                return "?";
        }
    }
}
