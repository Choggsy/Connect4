import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

class ExampleTest {
//Few example tests to check test dependencies are working

    @Nested
    class Preconditions {
        @Test
        void nameMustNotBeNull() {
            assertThatNullPointerException()
                    .isThrownBy(() -> new Example().hello(null))
                    .withMessage("name can not be null");
        }
    }

    @Test
    void hello() {
        assertThat(new Example().hello("chloe")).isEqualTo("Hello chloe");
    }

    @ParameterizedTest
    @ValueSource(strings = {"chichi", "goku", "mr popo"})
    void manyHellos(final String name) {
        assertThat(new Example().hello(name)).isEqualTo("Hello " + name);
    }
}