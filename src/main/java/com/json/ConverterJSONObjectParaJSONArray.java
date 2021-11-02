package com.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class ConverterJSONObjectParaJSONArray {

	public static void main(String[] args) {
		JSONObjectToArray();

	}
	
	private static void JSONObjectToArray() {
		//Criamos uma String
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		//adicinamos ela em um JSONObject
		JSONObject example = new JSONObject(string);
		
		//instanciamos um JSONSArray  com o tamanho do objeto da String
		JSONArray keyStrings = listNumberArray(example.length());
		
		//COnvertermos para JSONArray
		JSONArray array = example.toJSONArray(keyStrings);
		
		System.out.println("Final JSONArray: " + array);
	}
	// copiei ese método da classe AUsandoJSONArray
	private static JSONArray listNumberArray(int max) {
		JSONArray res = new JSONArray();
		for (int i = 0; i < max; i++) {
			// The value of the labels must be an String in order to make it work
			res.put(String.valueOf(i));
		}
		return res;
	}


}
