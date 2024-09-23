import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatIllegalStateException;


class ColumnTest {
    @ParameterizedTest
    @CsvSource(value = {" ", ",","","/","/n"})
    void columnValueIsNotBlank(final int columnValue) {
        assertThatIllegalStateException()
                .isThrownBy(() -> Column.create(columnValue))
                .withMessage("columnValue can not be blank");
    }
}