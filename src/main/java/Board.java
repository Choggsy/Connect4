import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

public class Board {

    private final Column column;
    private final Row row;

    public Board(final Column column, final Row row) {
        this.column = requireNonNull(column,"column can not be null");
        this.row = requireNonNull(row,"row can not be null");
    }

    public Column getColumn() {
        return column;
    }

    public Row getRow() {
        return row;
    }
}
