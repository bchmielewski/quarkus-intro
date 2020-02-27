package pl.itbrains.demo.quarkus.intro;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class IntroResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/intro")
          .then()
             .statusCode(200)
             .body(is("Quarkus Hello World!"));
    }

}