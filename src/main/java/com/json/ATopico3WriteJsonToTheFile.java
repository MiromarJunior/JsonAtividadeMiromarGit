package com.json;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ATopico3WriteJsonToTheFile {

	
	
	@SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        //primeiro criamos um JSONObject e colocamos chave e valor
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Lokesh");
        employeeDetails.put("lastName", "Gupta");
        employeeDetails.put("website", "howtodoinjava.com");
         //aqui criamos uma chave employed com valor da employeeDetails
        JSONObject employeeObject = new JSONObject(); 
        employeeObject.put("employee", employeeDetails);
         
        //Criando mais um conforme a primeira
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Brian");
        employeeDetails2.put("lastName", "Schultz");
        employeeDetails2.put("website", "example.com");
      //aqui criamos uma chave employed com valor da employeeDetails2
        JSONObject employeeObject2 = new JSONObject(); 
        employeeObject2.put("employee", employeeDetails2);
         
        //Adiconamos as duas em uma JSONArray
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
         
        //Salvamos um arquivo  com as informações do Array e informamos o camimnho para slavar arquivo
        try (FileWriter file = new FileWriter("./src/main/java/topico3.json")) {
            
            file.write(employeeList.toJSONString()); 
            file.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
