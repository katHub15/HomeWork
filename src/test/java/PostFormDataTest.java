import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static utils.Constants.*;


public class PostFormDataTest {

    @Test
    public void checkResponseFields() {
        given()
                .baseUri(BASE_URL)
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam(FOO_1, BAR_1)
                .formParam(FOO_2, BAR_2)
                .when()
                .log().all()
                .post(POST)
                .then()
                .log().all()
                .assertThat()
                .statusCode(STATUS_SUCCESS)
                .body(ARGS, equalTo(Collections.emptyMap()))
                .body(DATA, equalTo(""))
                .body(FILES, equalTo(Collections.emptyMap()))
                .body(FORM, equalTo(Map.of(
                        FOO_1, BAR_1,
                        FOO_2, BAR_2
                )))
                .body(HEADER_HOST, equalTo(POSTMAN_ECHO_COM))
                .body(HEADER_ACCEPT_ENCODING, equalTo(ENCODING))
                .body(HEADER_ACCEPT, equalTo(ACCEPT))
                .body(HEADER_X_FORWARDED_PROTO, equalTo(HTTPS))
                .body(HEADERS_CONTENT_TYPE, equalTo("application/x-www-form-urlencoded; charset=UTF-8"))
                .body(HEADERS_CONTENT_LENGTH, equalTo("19"))
                .body(JSON, equalTo(Map.of(
                        FOO_1, BAR_1,
                        FOO_2, BAR_2
                )))
                .body(URL, equalTo(BASE_URL+POST));
    }
}
