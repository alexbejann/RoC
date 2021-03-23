package nl.saxion.cos.model;

public class Variable
{
    private final String name;
    private final DataType type;
    private final int index;

    public Variable(String name, DataType type, int index)
    {
        this.name = name;
        this.type = type;
        this.index = index;
    }

    public String getName()
    {
        return name;
    }

    public DataType getType()
    {
        return type;
    }
}
