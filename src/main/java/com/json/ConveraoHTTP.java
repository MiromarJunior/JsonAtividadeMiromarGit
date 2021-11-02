package com.json;

import org.json.HTTP;
import org.json.JSONObject;

public class ConveraoHTTP {

	public static void main(String[] args) {

		HTTPToExampleConversion();
	//	HTTPFromExampleConversion();
	}
	
	private static void HTTPToExampleConversion() {

	
		
		String string = "{\"Method\":\"POST\",\"Request-URI\":'/',\"HTTP-Version\":'HTTP/1.1',\"Value1\":true,\"Value2\":2,\"Value3\":-2.345E68}";
		// JSONObject deve ter um cabeçalho minimo para  HTTP request ou header
		JSONObject example = new JSONObject(string);

	
		//Pegamos a String e convertemos com HTTP.toSTring()
		String output = HTTP.toString(example);
		System.out.println("Final HTTP: " + output);
	}
	
	
	private static void HTTPFromExampleConversion() {

		String string = "Final HTTP: POST '/' HTTP/1.1 Value3: -2.345E+68 Value1: true Value2: 2";

		//pegamos uma String no formato HTTP e fazemos o inverso do metod anterior

		JSONObject output = HTTP.toJSONObject(string);
		System.out.println("Final JSONObject: " + output);
	}



}
