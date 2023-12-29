package api.endpoints;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CcEndpoints {

    public static Response getCcRate() {
        Response response = given()
                .when()
                .get(Routes.getCcRate);

        return response;
    }
}
