package APIAutomation;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Getmethod {
	
    public static void main(String[] args) {
		
    	Response res=
    	given()
    	.contentType(ContentType.JSON)
    	.when()
    	.get("http://localhost:3000/employees");
    	
    	System.out.println("status code " +res.statusCode());
    	
    	System.out.println("***Data is****");
    	System.out.println(res.asString());
    	
    	
	}
    

}
