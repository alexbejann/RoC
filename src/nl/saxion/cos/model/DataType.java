package nl.saxion.cos.model;

public enum DataType
{
    BOOL("Z"),
    NUMAR("I"),
    SDC("Ljava/lang/String;"),
    AUTOMAT("Z"),
    SCANNER("java/util/Scanner"),
    SCURT("I");

    private final String byteType;

    DataType(String byteType)
    {
        this.byteType = byteType;
    }

    public String getByteType()
    {
        return byteType;
    }
}
