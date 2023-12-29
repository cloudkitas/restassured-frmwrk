package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Enumeration;
import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

public class CeEndpoints {

    static ResourceBundle getUrl() {
        ResourceBundle routes = ResourceBundle.getBundle("routes"); // Load Properties file
        return routes;
    }

    public static Response getRate() {

        String url = getUrl().getString("ce_base_url");
        Response response = given()
                .when()
                .get(url);

        return response;
    }
}
