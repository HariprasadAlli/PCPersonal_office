package https;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class CreateGLAMSJobTest {

    @Test
    public void testCreateGLAMSJob() {
        // Base URI
        RestAssured.baseURI = "https://glams61qa.glams.ie/api/app/task";

        // Send POST Request
        Response response = RestAssured
                .given()
                    .queryParam("name", "GLAMS Component Revise")
                    .contentType(ContentType.JSON)
                    .body("{ \"PartNumber\": \"CTN-14962-01\" }")
                .when()
                    .post()
                .then()
                    .log().all()
                    .extract().response();

        // Print status code and response
        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
  }
