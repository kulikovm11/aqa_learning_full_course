package restAssuredTools;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {
    public static RequestSpecification requestSpecification (String URL){
        return new RequestSpecBuilder()

                .setBaseUri(URL)
                .setContentType(ContentType.JSON)
                .build();

    }

    public static ResponseSpecification responseSpecification (int statusCode){
        return new ResponseSpecBuilder()

                .expectStatusCode(statusCode)
                .build();

    }

    public static void getSpecifications(RequestSpecification requestSpecification, ResponseSpecification responseSpecification){
        RestAssured.requestSpecification = requestSpecification;
        RestAssured.responseSpecification = responseSpecification;
    }



}
