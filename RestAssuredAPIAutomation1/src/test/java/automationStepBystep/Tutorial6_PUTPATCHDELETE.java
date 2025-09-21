package automationStepBystep;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;


import org.testng.annotations.Test;

import com.google.gson.JsonObject;

public class Tutorial6_PUTPATCHDELETE {

	@Test(priority =1)
	public void testPUT() {
		
		JSONObject request = new JSONObject();
		request.put("name", "Hari");
		request.put("job", "Trainer");
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given().
			header("x-api-key", "reqres-free-v1").
			body(request.toJSONString()).
		when().
			put("/users/2").
		then().
			statusCode(200).log().all();
		}
	
	@Test(priority =2)
	public void testPATCH() {
		
		JSONObject request = new JSONObject();
		request.put("name", "Hari");
		request.put("job", "Teacher");
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given().
			header("x-api-key", "reqres-free-v1").
			body(request.toJSONString()).
		when().
			patch("/users/2").
		then().
			statusCode(200).log().all();
		}
	
	@Test(priority = 3)
	public void testDELETE() {
		
		baseURI = "https://reqres.in";
		
		given().
		header("x-api-key", "reqres-free-v1").
		when().
			delete("/api/users/2").
		then().
			statusCode(204).log().all();
		}
	
}
