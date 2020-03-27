#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreatingsTests {

    @Test
    public void hello() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello, World!"));
    }

    @Test
    public void goodbye() {
        given()
                .when().get("/bye")
                .then()
                .statusCode(200)
                .body(is("Farewell, World!"));
    }
}
