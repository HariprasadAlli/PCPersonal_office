package automationStepBystep;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstTest {

	
	@Test
	public void test1() {
		Response response = RestAssured
				
		.given()
        .header("User-Agent", "Mozilla/5.0")  // add this line
        .when()
        .get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);

	}
}
