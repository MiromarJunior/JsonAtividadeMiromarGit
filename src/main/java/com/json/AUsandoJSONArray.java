package com.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class AUsandoJSONArray {
	public static void main(String[] args) {

		JSONExampleArray1();
		//JSONExampleArray2();
		//listNumberArray(5);
	}

	private static void JSONExampleArray1() {
		
		// Aqui foi criado uma String com valores concatenados arryStr e as 
		String arrayStr = "[" + "true," + "false," + "\"true\"," + "\"false\"," + "\"hello\"," + "23.45e-4,"
				+ "\"23.45\"," + "42," + "\"43\"," + "[" + "\"world\"" + "]," + "{" + "\"key1\":\"value1\","
				+ "\"key2\":\"value2\"," + "\"key3\":\"value3\"," + "\"key4\":\"value4\"" + "}," + "0," + "\"-1\""
				+ "]";

		// Aqui é instanciado um JSONArray array que recebe os valores da String arrayStr
		JSONArray array = new JSONArray(arrayStr);
		// Aqui é mostrato no console o array com os valores
		System.out.println("Values array: " + array);

		// gera uma JSONarray com os valores do tamanho das posições do array
		JSONArray list = listNumberArray(array.length());
		System.out.println("Label Array: " + list.toString());
		//Agora cria um JSONObject com a chave sendo a posição da list e valor sendo o contudo do array
		JSONObject object = array.toJSONObject(list);
		System.out.println("Final JSONOBject: " + object);
	}

	// Gera uma lista de array de acordo com a quantidade  que colocarmos como parametro tipo inteiro
	private static JSONArray listNumberArray(int max) {
		JSONArray res = new JSONArray();
		for (int i = 0; i < max; i++) {
			// The value of the labels must be an String in order to make it work
			res.put(String.valueOf(i));
		}
		//adicionei o println para ficar mais claro o retorno
		System.out.println(res);
		return res;
	}
	
	private static void JSONExampleArray2() {

		//Aqui foi criado um JSONArray sem ser uma String
		  JSONArray array = new JSONArray();

		//Adicionamos os valores direto pelo put
		array.put("value");
		array.put(5);
		array.put(-23.45e67);
		array.put(true);
		
		////Agora cria um JSONObject com a chave sendo a posição da list e valor sendo o contudo do array

		 JSONArray list = listNumberArray(array.length());
		 JSONObject object = array.toJSONObject(list);
		 System.out.println("Final JSONOBject: " + object);
	}


}
