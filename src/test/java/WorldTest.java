import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WorldTest {

    @Test
    void hello() {
        assertThat(new World().hello()).isEqualTo("Hello World");
    }
}