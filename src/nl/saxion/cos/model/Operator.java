package nl.saxion.cos.model;

public enum Operator
{
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    MODULO("%");

    private final String operator;

    Operator(String operator)
    {
        this.operator = operator;
    }
}
