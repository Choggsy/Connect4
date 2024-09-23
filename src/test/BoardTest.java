import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNullPointerException;

class BoardTest {

    @Nested
    class Preconditions {
        @Test
        void columnMustNotBeNull() {
            assertThatNullPointerException()
                    .isThrownBy(() -> new Board(null, makeRow(6)))
                    .withMessage("column can not be null");
        }

        @Test
        void rowMustNotBeNull() {
            assertThatNullPointerException()
                    .isThrownBy(() -> new Board(makeColumn(7),null))
                    .withMessage("row can not be null");
        }
    }

    private static Row makeRow(final int value) {
        return Row.create(value);
    }

    private static Column makeColumn(final int value) {
        return Column.create(value);
    }
}