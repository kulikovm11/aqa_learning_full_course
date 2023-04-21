package testPackage.lesson9_API_testing;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Type;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

//public class RestTest {
//    @Test
//    public void restAssuredTest(){
//        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
//        System.out.println(response.asString());
//        System.out.println(response.getStatusCode());

//        given()
//                .get("https://reqres.in/api/users?page=2")
//                .then()
//                .statusCode(200)
//                .log().body();

//        given()
//                .get("https://reqres.in/api/users?page=2")
//                .then()
//                .statusCode(200)
//                .body("data.id[1]",equalTo(8));

//        Response response = given()
//                .contentType(ContentType.JSON)
//                .when()
//                .get("https://reqres.in/api/users?page=2")
//                .then()
//                .extract().response();
//
//        Assert.assertEquals(200, response.getStatusCode());
//        Assert.assertEquals("Michael", response.jsonPath().getString("data.first_name[0]"));


//        JSONObject request = new JSONObject();
//        request.put("name", "Max");
//        request.put("job","Frontend");

//
//        given()
//                .header("Content-Type","application/json")
//                .contentType(ContentType.JSON)
//                .body(request)
//                .when()
//                .post("https://reqres.in/api/users")
//                .then()
//                .statusCode(201)
//                .log().all();

//        given()
//                .contentType(ContentType.JSON)
//                .body(request)
//                .when()
//                .put("https://reqres.in/api/users/2")
//                .then()
//                .statusCode(200)
//                .log().body();

//        given()
//                .delete("https://reqres.in/api/users/2")
//                .then()
//                .statusCode(204)
//                .log().all();



//    }
//}
