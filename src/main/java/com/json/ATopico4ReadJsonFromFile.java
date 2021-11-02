package com.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ATopico4ReadJsonFromFile {
	
	@SuppressWarnings("unchecked")
    public static void main(String[] args) 
    {
        //Instancia o JSONParse para fazer a leitura do arquivo
        JSONParser jsonParser = new JSONParser();
         //cria uma File reader para ler o local do arquivo
        try (FileReader reader = new FileReader("./src/main/java/topico3.json"))
        {
            //instancia um objeto para receber a leitura do arquivo  pelo jsaonParser
            Object obj = jsonParser.parse(reader);
            
            //instancia um JSONArray com cast para armazenar o obj
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
             
            //Faz um Foreach no metodo parseEmployedeObject usando lambda para obter apenas o valor das chaves
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
            //cath para se der alguma exceção mostrar
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseEmployeeObject(JSONObject employee) 
    {
        //Instancia um employeeObject para pegar o valor das chaves
        JSONObject employeeObject = (JSONObject) employee.get("employee");
         
        //Cria uma String para pegar o primeiro nome
        String firstName = (String) employeeObject.get("firstName");    
        System.out.println(firstName);
         
        //Cria uma String para pegar  o ultimo nome
        String lastName = (String) employeeObject.get("lastName");  
        System.out.println(lastName);
         
        //Cria uma String para pegar  o site
        String website = (String) employeeObject.get("website");    
        System.out.println(website);
    }

}
