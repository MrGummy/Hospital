package hosp.mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import hosp.model.Appointment;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Glover
 */
public class JsonAppointmentMapper {
     public static String toJSON(Appointment appointment)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(appointment);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonAppointmentMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Appointment> appointment)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(appointment);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonAppointmentMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Appointment fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Appointment appointment =mapper.readValue(json, Appointment.class);
            return appointment;
        } catch (IOException ex) {
            Logger.getLogger(JsonAppointmentMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}