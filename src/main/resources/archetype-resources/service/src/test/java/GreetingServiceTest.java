#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreetingServiceTest {

    private final GreetingService service = new GreetingService();

    @Test
    public void setHello() {
        assertThat(service.hello())
                .isEqualTo("Hello, World!");
    }

    @Test
    public void setGoodbye() {
        assertThat(service.goodbye())
                .isEqualTo("Farewell, World!");
    }

}