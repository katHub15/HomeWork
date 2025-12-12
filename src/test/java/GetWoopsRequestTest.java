import org.junit.jupiter.api.Test;
import java.util.Collections;
import utils.Constants;

import static utils.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetWoopsRequestTest {

    @Test
    public void checkResponseFields() {
        given()
                .baseUri(BASE_URL)
                .queryParam(FOO_1, BAR_1)
                .queryParam(FOO_2, BAR_2)
                .when()
                .log().all()
                .get(GET)
                .then()
                .log().all()
                .assertThat()
                .statusCode(STATUS_SUCCESS)
                .body("args.foo1", equalTo(BAR_1))
                .body("args.foo2", equalTo(BAR_2))
                .body(HEADER_HOST, equalTo(POSTMAN_ECHO_COM))
                .body(HEADER_ACCEPT_ENCODING, equalTo(ENCODING))
                .body(HEADER_ACCEPT, equalTo(ACCEPT))
                .body(HEADER_X_FORWARDED_PROTO, equalTo(HTTPS))
                .body(URL, equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }
}
