package RestfulBooker.getExample;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;

public class getSpecificData {
    @Test
    public void GetBUsers() {

        RestAssured.baseURI="https://reqres.in/api/users";

//        RestAssured.given()
//                //.param("2")
//                .when()
//                .get("/2")
//                .then()
//                .assertThat()
//                .log()
//                .all()
//                .statusCode(200);

        String userFirstName=
                RestAssured
                .given()
                .contentType(ContentType.JSON)
                .get("/2")
                .then()
                .extract()
                .path("first_name");

    }
}
