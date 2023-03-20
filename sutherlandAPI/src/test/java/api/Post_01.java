package api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

// this is not BDD but just showed the way it could be done


public class Post_01 {

	@Test
	public void create_post() {
		RestAssured.baseURI="https://6143a99bc5b553001717d06a.mockapi.io";
		
		String payload ="{\r\n"
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
				+ "    \"id\": \"319\"\r\n"
				+ "}";
		
		
		RequestSpecification httpreq = RestAssured.given();
		
		httpreq.header("Content-Type","application/json");
		Response response =httpreq.body(payload).post("/testapi/v1/Users");
		
		response.statusCode();
		int statuscode=response.getStatusCode();
		
		System.out.println(statuscode);
		
		
	}
	
	
	
	
}
