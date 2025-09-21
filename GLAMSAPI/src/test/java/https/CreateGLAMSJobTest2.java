package https;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CreateGLAMSJobTest2 {

    @Test
    public void testCreateGLAMSJob() {
        JSONObject request = new JSONObject();
		request.put("ComponentType", "Booklet");
		request.put("ProductName", "Botox");
		request.put("Country", "India");
		request.put("PackagingSite", "CMO3");
		request.put("ArtworkStudio", "Perigord_India");
		request.put("Date", "23-Jan-2020");
		request.put("PackagingCode", "123");
		
		
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://glams6qa.glams.ie/api/App/task";
		
		given()
		.auth()
	    .preemptive()
	    .basic("Hariprasad", "Perigord2!")
	    .param("name", "GLAMS Component - Create Request without supporting docs").
	    when()
	    .post().
		then().
			statusCode(200).log().all();


    }
  }
