package RestfulBooker.postExample;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;

public class PassFileAsPayload {

    @Test
    public void passFilePayload(){
        File jasonDataFilePayload=new File("./src/test/resources/AuthPayload.json");
        //Given
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/auth")
                .contentType(ContentType.JSON)
                .body(jasonDataFilePayload)
        //when
                .post()

        //Then
               .then()
                .log()
                .all()
               .assertThat()
               .statusCode(200);
    }
}
