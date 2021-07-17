package RestfulBooker.getExample;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NonBDDStyleGetRequest {

    @Test
    public void GetBookingIds_VerifyStatusCode(){

        //Create a request specification
        RequestSpecification request= RestAssured.given();

        //Adding URI
        request.baseUri("https://restful-booker.herokuapp.com/booking");

        //Calling Get Method
        Response response=request.get();

        //Print response body
        String resString=response.asString();

        ValidatableResponse valRes=response.then();
        valRes.statusCode(200);

    }
}
