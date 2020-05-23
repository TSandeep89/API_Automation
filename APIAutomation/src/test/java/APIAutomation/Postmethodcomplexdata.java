package APIAutomation;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Postmethodcomplexdata {

	public static void main(String[] args) {
		
		/**********Body Data using org.json***********/
		JSONObject jo = new JSONObject();
		jo.put("state", "Ghaziabad");
		jo.put("H.No", "B-104");
		jo.put("Area", "New Panchwati");
		
		JSONObject jd = new JSONObject();
		jd.put("firstname", "toshi");
		jd.put("lastname", "sandy");
		jd.put("designation", "Quality Analyst");
		jd.put("Address", jo);
		System.out.println(jo.toString());
		
		/***********Hit the post request********/
		Response res=
		given()
    	.contentType(ContentType.JSON)
    	.body(jd.toString())
    	.when()
    	.post("http://localhost:3000/employees");
		System.out.println("status code" +res.statusCode());
		
		
		
		
	}
	
}
