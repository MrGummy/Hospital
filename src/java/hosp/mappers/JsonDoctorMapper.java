/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.mappers;

import hosp.model.Doctor;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Евгений Мартыненко General-zver
 */
public class JsonDoctorMapper {
    
    public static String toJSON(Doctor doctor)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(doctor);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonDoctorMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Doctor> doctor)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(doctor);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonDoctorMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Doctor fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Doctor doctor =mapper.readValue(json, Doctor.class);
            return doctor;
        } catch (IOException ex) {
            Logger.getLogger(JsonDoctorMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
