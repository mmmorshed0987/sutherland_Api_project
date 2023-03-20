package api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
// get


public class Get_002 {

	@Test
	public void get_002() {
		given().
		when().
		get("https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1/Users/309").
		then().statusCode(200).
		assertThat().
		body("employee_firstname",equalTo("TestData12345")).
		body("employee_lastname",equalTo("TestData12345")).
		body("employee_phonenumbe",equalTo("264-783-9453")).
		body("ademployee_emaildress",equalTo("ademployee_emaildress 1")).
		body("citemployee_addressy",equalTo("citemployee_addressy 1")).
		body("stateemployee_dev_level",equalTo("stateemployee_dev_level 1")).
		body("employee_gender",equalTo("employee_gender 1")).
		body("employee_hire_date",equalTo("2025-10-31T16: 35: 45.426Z"));
		
	}
	
	
	
}
