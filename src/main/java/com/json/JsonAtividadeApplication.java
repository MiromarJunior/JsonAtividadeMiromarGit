package com.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonAtividadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonAtividadeApplication.class, args);
		
		JSONExampleObject3();
		
	}
	private static void JSONExampleObject3() {

		//We can also create a JSONObject with a Java Map
		//YoU will need a Map whose keys are Strings. The values can be whatever you want

		Map<String,Double> map = new HashMap<String, Double>();
		
		map.put("key1", 1.0);
		map.put("key2", -23.45e67);
		
		//We create the JSONObject with the map with its class builder

		JSONObject example = new JSONObject(map);
		 System.out.println("Final JSONOBject: " + example);
	}

	
	
	

}
