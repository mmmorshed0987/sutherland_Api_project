package api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_001 {

	
	@Test
	public void sample_get_001() {
		given().
		when().
		get("https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1/Users/307").
		then().statusCode(200).
		assertThat().
		body("employee_firstname",equalTo("John"));
		
	}
	
	
	
	
	
}
