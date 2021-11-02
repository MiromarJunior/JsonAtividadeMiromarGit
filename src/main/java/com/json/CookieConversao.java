package com.json;

import org.json.Cookie;
import org.json.JSONObject;

public class CookieConversao {

	public static void main(String[] args) {
		CookieToExampleConversion();
	//	CookieFromExampleConversion();
	}
	
	
	private static void CookieToExampleConversion() {

		
		// O JSONOBject precisa de entradas que dão ao cookie um nome e ao campo "nome" também.
		// O formato Cokkie não suporta booleanos
		String string = "{\"name\":\"Cookie-Name\",\"value\":\"name\",\"1\":5,\"2\":-2.345E68,\"3\":'true'}";
		JSONObject example = new JSONObject(string);
		
		//Fazemos a conversão usando o método Cookie.toString

		String output = Cookie.toString(example);
		System.out.println("Final Cookie: " + output);
	}
	
	private static void CookieFromExampleConversion() {

		//Faz o reverso da anterior

		String string = "Cookie-Name=name;1=5;2=-2.345E%2b68;3=true";

		//utilizando o método Cookie.toJSONObject

		JSONObject output = Cookie.toJSONObject(string);
		System.out.println("Final JSONObject: " + output);
	}



}
