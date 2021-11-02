package com.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class AUsandoJSONObject {

	public static void main(String[] args) {

		JSONExampleObject1();
		// JSONExampleObject2();
		// JSONExampleObject3();

	}

	private static void JSONExampleObject1() {

		// Aqui foi criado uma String com valores concatenados arryStr e as
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		// Agora cria um JSONObject
		JSONObject example = new JSONObject(string);
		System.out.println("Final JSONObject: " + example);

	}

	private static void JSONExampleObject2() {

		JSONObject example = new JSONObject();

		// Adiciona chave e valor usando o put no JSONObject
		example.put("key", "value");
		example.put("key2", 5);
		example.put("key3", -23.45e67);
		example.put("trueValue", true);

		// não podemos colocar um valor nulo no put do JSONObject tanto na chave quanto no valor
		System.out.println("Final JSONOBject: " + example);
	}
	private static void JSONExampleObject3() {

		// Aqui criamos um map e incluimos os valores com put e depois adicionamos os
		// valores em um JSONObject
		Map<String, Double> map = new HashMap<String, Double>();

		map.put("key1", 1.0);
		map.put("key2", -23.45e67);
		JSONObject example = new JSONObject(map);
		System.out.println("Final JSONOBject: " + example);
	}

}
