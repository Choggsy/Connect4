import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class WorldTest {

    @Test
    void hello() {
        assertThat(new World().hello("chloe")).isEqualTo("Hello chloe");
    }

    @ParameterizedTest
    @ValueSource(strings = {"chichi","goku","mr popo"})
    void manyHellos(final String name){
        assertThat(new World().hello(name)).isEqualTo("Hello " + name);
    }
}