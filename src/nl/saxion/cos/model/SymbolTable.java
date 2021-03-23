package nl.saxion.cos.model;

import java.util.HashMap;

public class SymbolTable
{
    private int nextIndex = 0;

    private final HashMap<String, Variable> symbols;

    public SymbolTable()
    {
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

        return symbols.get(name);
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

    /*public SymbolTable openScope()
    {
        SymbolTable childScope = new SymbolTable();
        childScope.parentScope = this;
        childScope.nextIndex = nextIndex;
        return childScope;

    }

    public SymbolTable getParentScope()
    {
        return parentScope;

    }*/
}
