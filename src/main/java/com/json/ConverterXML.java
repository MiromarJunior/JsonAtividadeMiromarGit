package com.json;

import org.json.JSONObject;
import org.json.XML;

public class ConverterXML {

	public static void main(String[] args) {
		//XMLToExampleConversion();
		XMLFromExampleConversion();
	}
	
	private static void XMLToExampleConversion() {

		//Iniciamos uma String e depois adicinamos para JSONObject		
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);

		//We obtain a String with XML format with toString()
		//Criamos uma String para receber o valor do JSONObject convertido no modelo XML com o método XML.toString
		String output = XML.toString(example);
		System.out.println("Final XML: " + output);
	}
	
	private static void XMLFromExampleConversion() {

		//colocamos o texto xml em uma STring
		String string = "<0>value</0><1>5</1><2>-2.345E+68</2><3>true</3>";

		//Agora colocamos em um JSONObject o metodo XML.toJSONObject para retornar a uma String 
		JSONObject output = XML.toJSONObject(string);
		
		System.out.println("Final JSONObject: " + output);
	}



}
