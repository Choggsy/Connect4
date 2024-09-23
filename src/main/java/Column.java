import static java.util.Objects.requireNonNull;

public class Column {
    private final int value;

    private Column(final int value) {
        this.value = value;
    }

    public static Column create(final int value) {
        return new Column(value);
    }

    public int getValue() {
        return value;
    }
}
