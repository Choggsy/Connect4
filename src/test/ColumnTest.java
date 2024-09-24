import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIndexOutOfBoundsException;

class ColumnTest {

    @Test
    void canGetValueFromColumn() {
        assertThat(Column.create(1).getValue()).isEqualTo(1);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1,-10})
    void canGetValueFromColumn2(final int value) {
        assertThatIndexOutOfBoundsException()
                .isThrownBy(()-> Column.create(value).getValue())
                .withMessage("column value must be greater than zero");
    }

}