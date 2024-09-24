package gridComponents;


import org.assertj.core.api.Fail;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNullPointerException;

class ColumnRangeTest {

    @Test
    void columnUpperBoundMustNotBeNull() {
        assertThatNullPointerException()
                .isThrownBy(() -> ColumnRange.of(null))
                .withMessage("columnUpperBound can not be null");
    }

    @Test
    void returnsAListOfColumnsInRange() {
        new Fail("finish me to return list of columns");
    }
}