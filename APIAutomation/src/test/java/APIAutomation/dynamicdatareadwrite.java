package APIAutomation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class dynamicdatareadwrite {

	public static void main(String[] args) throws FileNotFoundException {
		
/*******Read dynamic data from json file**********/
		
		File f = new File("../APIAutomation/Newjsonfile.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject jo = new JSONObject(jt);
		
		System.out.println("Data ready for POST request");
		System.out.println(jo.toString());
	}
}
