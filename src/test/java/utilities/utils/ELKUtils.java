/**
 * 
 */
package utilities.utils;


import enums.ConfigProperties;
import io.restassured.response.Response;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ELKUtils {

	private ELKUtils() {}

	public static void sendDetailsToElk(String testname,String status) {

		if(PropertyUtils.get(ConfigProperties.SENDRESULTTOELK).equalsIgnoreCase("yes")) {
			Map<String,String> map = new HashMap<>();
			map.put("testName",testname );
			map.put("status" , status);
			map.put("executionTime", LocalDateTime.now().toString());

			Response response = given().header("Content-Type","application/json")
					.log()
					.all()
					.body(map)
					.post(PropertyUtils.get(ConfigProperties.ELASTICURL));

			Assert.assertEquals(response.statusCode(), 201);

			response.prettyPrint();
		}
	}

}
