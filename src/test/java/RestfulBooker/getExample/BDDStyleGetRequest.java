package RestfulBooker.getExample;

import io.restassured.RestAssured;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class BDDStyleGetRequest {

    @Test
    public void GetBookingIds_VerifyStatusCode(){
        //Given
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
        //When
                .when()
                      .get("/booking")
        //Then
                .then()
                      .statusCode(200)
                      .statusLine("HTTP/1.1 200 OK")
                      .body("bookingid.sum()", Matchers.is(29))
                      .body("bookingid[2]",Matchers.equalTo(16));

    }
}
