package com.json;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

public class ConversaoCDL {

	public static void main(String[] args) {
		CDLToExampleConversion();
		//CDLFromExampleConversion();
	
	}
	
	
	private static void CDLToExampleConversion() {

		//Iniciamos JSONObject com diferentes valores

		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);
		
		String string2 = "{\"0\":\"value2\",\"1\":6,\"2\":-8.345E68,\"3\":false}";
		JSONObject example2 = new JSONObject(string2);
		
		//We need now a JSONArray with those JSONObjects

		JSONArray array = new JSONArray();
		array.put(example);
		array.put(example2);

		
		//Obtemos a String com formato CDL.toString()
		String output = CDL.toString(array);
		System.out.println("Final CDL: \r\n" + output);
	}
	
	private static void CDLFromExampleConversion() {

		//Faz o inverso da anterior

		String string = "0,1,2,3\n"
				+ "value,5,-2.345E+68,true\n"
				+ "value2,6,-8.345E+68,false";
		
		//We obtain a JSONArray with toJSONOBject()

		JSONArray output = CDL.toJSONArray(string);
		System.out.println("Final JSONArray: " + output);
	}

}


