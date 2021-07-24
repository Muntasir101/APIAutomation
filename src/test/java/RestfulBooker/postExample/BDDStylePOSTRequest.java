package RestfulBooker.postExample;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;

import com.google.common.io.Files;

public class BDDStylePOSTRequest {

    public static void main(String[] args) throws IOException {
        String jsonString ="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RequestSpecification request= RestAssured
                .given()
                .contentType(ContentType.JSON)
                .baseUri("https://restful-booker.herokuapp.com/auth")
                .body(jsonString);

        Response response=request.post();

        //Getting response as a string and writing it to a file
        String responseAsString=response.asString();

        //Converting in to byte array before writing
        byte[] responseAsStringByte=responseAsString.getBytes();

        //Creating target file
        File targetFileForString=new File("./src/main/resources/Token.txt");

        //Writing into Files
        Files.write(responseAsStringByte,targetFileForString);



    }

}
