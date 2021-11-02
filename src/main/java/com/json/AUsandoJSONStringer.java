package com.json;

import org.json.JSONObject;
import org.json.JSONStringer;

public class AUsandoJSONStringer {

	public static void main(String[] args) {
		
		
		JSONExampleStringer();


	}
	
	private static void JSONExampleStringer() {

		//Inicializa um JSONStringer
		JSONStringer jsonStringer = new JSONStringer();

		//para adicionar objetos temos que usar .object 

        jsonStringer.object();

        //Agora adicionamos chave e valor através de  .values () and .key()

        jsonStringer.key("trueValue").value(true);
        jsonStringer.key("falseValue").value(false);
        jsonStringer.key("nullValue").value(null);
        jsonStringer.key("stringValue").value("hello world!");
        jsonStringer.key("complexStringValue").value("h\be\tllo w\u1234orld!");
        jsonStringer.key("intValue").value(42);
        jsonStringer.key("doubleValue").value(-23.45e67);

        //Aqui finaliza o processo de adicionar com o .endObject()

        jsonStringer.endObject();

       //Once we have a JSONStringer, we convert it to JSONObject generating a String and using JSONObject's contructor.
        // adiconamos o valor do jsonStringer na String str usando .toString()
        String str = jsonStringer.toString();
        
        //Agora usamos um JSONObject para armazenar os valores dessa String
        JSONObject jsonObject = new JSONObject(str);
        //Aqui vai imprimir todas chave e valores 
       System.out.println("Final JSONOBject: " + jsonObject);
	}


}
