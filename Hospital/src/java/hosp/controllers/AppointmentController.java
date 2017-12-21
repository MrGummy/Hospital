/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.controllers;

import java.util.List;
import hosp.DAL.AppointmentDal;
import hosp.model.Appointment;

/**
 *
 * @author General-zver (Евгений Мартыненко)
 */
public class AppointmentController {
    protected AppointmentDal appointmentDal;
    public AppointmentController() 
    {
        appointmentDal = new AppointmentDal();
    }
    
    public List<Appointment> getAllAppointment()
    {
        return appointmentDal.selectAll();
    }
    
    public Appointment getAppointment(int id)
    {
        return appointmentDal.selectById(id);
    }
    
    public List<Appointment> getAppointmentByDoctorId(int doctor_id)
    {
        return appointmentDal.selectByDoctorId(doctor_id);
    }
     
    public int insertAppointment(Appointment appointment)
    {
        return appointmentDal.insert(appointment);
    }
      
    public int updateAppointment(Appointment appointment)
    {
        return appointmentDal.update(appointment);
    }
    
    public int deleteAppointmentById(int id)
    {
        return appointmentDal.delete(id);
    }
    
}
