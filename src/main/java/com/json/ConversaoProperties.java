package com.json;

import java.util.Properties;

import org.json.JSONObject;
import org.json.Property;

public class ConversaoProperties {

	public static void main(String[] args) {
		PropertyToExampleConversion();
		//PropertyFromExampleConversion();
	}
	
	private static Properties PropertyToExampleConversion() {

	
	String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
	JSONObject example = new JSONObject(string);

	//coonvertemos com Property.toPreoperties

	Properties output = Property.toProperties(example);
	System.out.println("Final Properties: " + output);

	return output;
	}
	
	private static void PropertyFromExampleConversion() {

		

		Properties input = PropertyToExampleConversion();

		//Converte para JSONObject

		JSONObject output = Property.toJSONObject(input);
		System.out.println("Final JSONObject: " + output);
	}



}
