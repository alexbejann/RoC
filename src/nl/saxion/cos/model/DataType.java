package nl.saxion.cos.model;

public enum DataType
{
    BOOL("Z"),
    NUMAR("I"),
    SDC("Ljava/lang/String;"),
    AUTOMAT("Z");

    private final String byteType;

    DataType(String byteType)
    {
        this.byteType = byteType;
    }
}
