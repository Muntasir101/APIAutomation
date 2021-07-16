package JavaConcepts;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.ContentType;

public class BuilderPatternRestAssured {
    public static void main(String[] args) {

        //way 1
        RequestSpecification req=RestAssured.given();
        req=req.accept(ContentType.JSON);
        req=req.auth().preemptive().basic("username","password");
        req=req.header("headername","headervalue");
        req=req.param("paramname","paramvalue");
        req=req.cookie("cookiename","cookievalue");

        //Way 2
        RequestSpecification req2=
                RestAssured
                        .given()
                        .accept(ContentType.JSON)
                        .auth().preemptive().basic("username","password")
                        .header("headername","headervalue")
                        .param("paramname","paramvalue")
                        .cookie("cookiename","cookievalue");
    }
}
