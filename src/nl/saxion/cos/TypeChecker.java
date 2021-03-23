package nl.saxion.cos;


import nl.saxion.cos.model.DataType;

public class TypeChecker extends RoCBaseVisitor<DataType>
{
    public TypeChecker()
    {

    }

    public boolean isFailed()
    {
        return false;
    }
}
