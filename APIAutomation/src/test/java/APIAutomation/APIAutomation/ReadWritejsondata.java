package APIAutomation.APIAutomation;

import static com.jayway.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ReadWritejsondata {

	public static void main(String[] args) throws FileNotFoundException {
		
		/*******Read data from json file**********/
		
		File f = new File("../APIAutomation/bodydata.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject jo = new JSONObject(jt);
		
		System.out.println("Data ready for POST request");
		System.out.println(jo.toString());
		
		
		/*******Put data from json file**********/
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(jo.toString())
		.when()
		.post("http://localhost:3000/employees");
		System.out.println("status code" +res.statusCode());
		System.out.println("test");
		
		
		
	}
}
