package api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Post_02 {

	
	@Test
	public void createPost() {
		
		given().contentType("application/json").body("{\r\n"
				+ "    \"createdAt\": 1631825833,\r\n"
				+ "    \"employee_firstname\": \"TestData12345\",\r\n"
				+ "    \"employee_lastname\": \"TestData12345\",\r\n"
				+ "    \"employee_phonenumbe\": \"264-783-9453\",\r\n"
				+ "    \"ademployee_emaildress\": \"ademployee_emaildress 1\",\r\n"
				+ "    \"citemployee_addressy\": \"citemployee_addressy 1\",\r\n"
				+ "    \"stateemployee_dev_level\": \"stateemployee_dev_level 1\",\r\n"
				+ "    \"employee_gender\": \"employee_gender 1\",\r\n"
				+ "    \"employee_hire_date\": \"2025-10-31T16: 35: 45.426Z\",\r\n"
				+ "    \"employee_onleave\": true,\r\n"
				+ "    \"tech_stack\": [],\r\n"
				+ "    \"project\": [],\r\n"
				+ "    \"id\": \"318\"\r\n"
				+ "}").when().post("https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1/Users").
				then().statusCode(201).log().body();
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
