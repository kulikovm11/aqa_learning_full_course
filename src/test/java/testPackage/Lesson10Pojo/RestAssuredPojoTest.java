package testPackage.Lesson10Pojo;

import com.codeborne.selenide.commands.As;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import restAssuredTools.CreateUser.CreateUserRequest;
import restAssuredTools.CreateUser.CreateUserResponse;
import restAssuredTools.RegisterSuccessful.RegisterSuccessfulRequest;
import restAssuredTools.RegisterSuccessful.RegisterSuccessfulResponse;
import restAssuredTools.Specifications;
import restAssuredTools.UpdateUser.UpdateUserRequest;
import restAssuredTools.UpdateUser.UpdateUserResponse;
import restAssuredTools.User.User;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RestAssuredPojoTest {
    private static final String BASE_URL = "https://reqres.in/";
    @Test
    public void RestAssuredPojoTest(){
        Specifications.getSpecifications(Specifications.requestSpecification(BASE_URL),Specifications.responseSpecification(200));
        List<User> userList = given()
                .when()
                .get("api/users?page=2")
                .then()
                .extract().body().jsonPath().getList("data", User.class);

        Assert.assertNotNull(userList );

//        for (User user : userList) {
//            Assert.assertTrue(user.getAvatar().contains(user.getId().toString()));
//
//        }
        userList.forEach(user -> Assert.assertTrue(user.getAvatar().contains(user.getId().toString())));
        userList.forEach(user -> Assert.assertTrue(user.getEmail().contains("@reqres.in")));

    }

    @Test
    public void createUserTest(){
        Specifications.getSpecifications(Specifications.requestSpecification(BASE_URL),Specifications.responseSpecification(201));
        CreateUserRequest request = new CreateUserRequest();
        request.setName("Max");
        request.setJob("Frontend");

        CreateUserResponse userResponse = given()
                .body(request)
                .when()
                .post("api/users")
                .then()
                .log().body()
                .extract().as(CreateUserResponse.class);

        Assert.assertEquals(request.getName(),userResponse.getName());

    }

    @Test
    public void registerSuccessfulTest(){
        Specifications.getSpecifications(Specifications.requestSpecification(BASE_URL),Specifications.responseSpecification(200));
        int id = 4;
        String token = "QpwL5tke4Pnpja7X4";

        RegisterSuccessfulRequest requestUser = new RegisterSuccessfulRequest("eve.holt@reqres.in","pistol");

        RegisterSuccessfulResponse responseUser = given()
                .body(requestUser)
                .when()
                .post("api/register")
                .then()
                .extract().as(RegisterSuccessfulResponse.class);

        Assert.assertEquals(Integer.toString(id), responseUser.getId().toString());
        Assert.assertEquals(token, responseUser.getToken());

    }

    @Test
    public void updateUserTest(){
        Specifications.getSpecifications(Specifications.requestSpecification(BASE_URL),Specifications.responseSpecification(200));

        UpdateUserRequest updateRequest = new UpdateUserRequest("morpheus","zion resident");

        UpdateUserResponse updateResponse = given()
                .body(updateRequest)
                .when()
                .put("api/users/2")
                .then()
                .log().body()
                .extract().as(UpdateUserResponse.class);

        Assert.assertEquals(updateRequest.getName(),updateResponse.getName());
        Assert.assertEquals(updateRequest.getJob(),updateResponse.getJob());


    }

}
