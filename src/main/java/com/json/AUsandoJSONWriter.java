package com.json;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONWriter;

public class AUsandoJSONWriter {

	public static void main(String[] args) {
		//JSONExamplWriter();
		//JSONExampleTokener();
		


	}
	
	private static void JSONExamplWriter() {

		//JSONWriter trabalha muito parecido com JSONObject e JSONStringer, mas ele necessita 
		//de uma StringBuilder de paraemetro para adicionar os objetos 
		StringBuilder write = new StringBuilder();
		JSONWriter jsonWriter = new JSONWriter(write);

		
		jsonWriter.object();
		// aqui podemos colocar valor nulo, mas apenas no valor e não na chave
		jsonWriter.key("trueValue").value(true);
		jsonWriter.key("falseValue").value(false);
		jsonWriter.key("nullValue").value(null);
		jsonWriter.key("stringValue").value("hello world!");
		jsonWriter.key("complexStringValue").value("h\be\tllo w\u1234orld!");
		jsonWriter.key("intValue").value(42);
		jsonWriter.key("doubleValue").value(-23.45e67);
		
		jsonWriter.endObject();
		
				
		System.out.println("JSON: " + write.toString());
		
		//No final vc não chama o JSONWriter, mas sim a StringBuilder com ometodo .toString()
		
		
		
		
	}
	private static void JSONExampleTokener() {

		//A partir de una String podemos criar un JSONTokener, que lo podemos usar alternativamente para JSONArray,JSONObject

		String string = "this is not a valid JSON string";
		JSONTokener token = new JSONTokener(string);
		
		//Aqui vc pode usar o token em JSONObject da mesma forma que uma String,

		JSONObject object = new JSONObject(token);
		JSONArray array = new JSONArray(token);
		
		
	}



}
