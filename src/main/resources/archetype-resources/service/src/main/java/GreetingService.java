#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.enterprise.context.Dependent;

@Dependent
public class GreetingService {
    public String goodbye() {
        return "Farewell, World!";
    }

    public String hello() {
        return "Hello, World!";
    }
}
