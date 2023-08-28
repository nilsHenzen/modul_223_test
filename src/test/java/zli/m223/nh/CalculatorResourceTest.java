package zli.m223.nh;

import org.junit.Test;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculatorResourceTest {
    @Test
    public void testCalculatorEndpoint() {
        given()
        .when().get("/calculator/add/8/10")
        .then()
           .statusCode(200)
           .body(is(18));

    }
}
