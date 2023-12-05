package OOP;

public enum SerializationStrategy {
    SNAKE_CASE("snake case"),
    CAMEL_CASE("camel case", "1"),
    KEBAB_CASE("kebab case");

    private final String readableName;
    private final String id;

    SerializationStrategy(final String readableName){
        this.readableName = readableName;
        this.id = "0";
    }
    SerializationStrategy(final String readableName, final String id){
        this.readableName = readableName;
        this.id = id;
    }

    public String getReadableName(){
        return readableName;
    }
}
