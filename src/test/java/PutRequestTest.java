import org.junit.jupiter.api.Test;

import java.util.Collections;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static utils.Constants.*;


public class PutRequestTest {
    @Test
    public void checkResponseFields() {
        given()
                .baseUri(BASE_URL)
                .body(BODY_TEXT)
                .when()
                .log().all()
                .put(PUT)
                .then()
                .log().all()
                .assertThat()
                .statusCode(STATUS_SUCCESS)
                .body(ARGS, equalTo(Collections.emptyMap()))
                .body(DATA, equalTo(BODY_TEXT))
                .body(FILES, equalTo(Collections.emptyMap()))
                .body(FORM, equalTo(Collections.emptyMap()))
                .body(HEADER_HOST, equalTo(POSTMAN_ECHO_COM))
                .body(HEADER_ACCEPT_ENCODING, equalTo(ENCODING))
                .body(HEADER_ACCEPT, equalTo(ACCEPT))
                .body(HEADER_X_FORWARDED_PROTO, equalTo(HTTPS))
                .body(HEADERS_CONTENT_TYPE, equalTo("text/plain; charset=ISO-8859-1"))
                .body(HEADERS_CONTENT_LENGTH, equalTo("58"))
                .body(JSON, equalTo(null))
                .body(URL, equalTo(BASE_URL+PUT));
    }
}
