/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.mappers;

import hosp.model.State;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Евгений Мартыненко General-zver
 */
public class JsonStateMapper {
    public static String toJSON(State state)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(state);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonStateMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<State> state)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(state);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonStateMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static State fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            State state =mapper.readValue(json, State.class);
            return state;
        } catch (IOException ex) {
            Logger.getLogger(JsonStateMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
