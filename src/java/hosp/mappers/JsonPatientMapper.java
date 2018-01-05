/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.mappers;

import hosp.model.Patient;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Евгений Мартыненко General-zver
 */
public class JsonPatientMapper {
    public static String toJSON(Patient patient)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(patient);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonPatientMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Patient> patient)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(patient);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonPatientMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Patient fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Patient patient =mapper.readValue(json, Patient.class);
            return patient;
        } catch (IOException ex) {
            Logger.getLogger(JsonPatientMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
