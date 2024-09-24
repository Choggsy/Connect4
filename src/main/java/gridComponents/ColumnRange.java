package gridComponents;


import io.vavr.collection.List;

import static java.util.Objects.requireNonNull;

//package-private for object access
class ColumnRange {

    private final Integer upperBound;

    private ColumnRange(final Integer upperBound) {
        this.upperBound = upperBound;
    }

    public static List<Column> of(final Integer upperBound) {
        requireNonNull(upperBound,"columnUpperBound can not be null");
        return List.empty();
    }
}
