package APIAutomation;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;

public class Postmethod {
	
	public static void main(String[] args) {
		
		/**********Body Data using org.json***********/
		JSONObject js = new JSONObject();
		js.put("firstname", "chaudhary");
		js.put("lastname", "sachin");
		js.put("designation", "Sr. Quality Analyst");
		js.put("id", "101");
		System.out.println(js.toString());
		
		/***********Hit the post request********/
		
		given()
    	.contentType(ContentType.JSON)
    	.body(js.toString())
    	.when()
    	.post("http://localhost:3000/employees");
		
		
	}

}
