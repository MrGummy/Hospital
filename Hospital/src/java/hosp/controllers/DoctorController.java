/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.controllers;

import java.util.List;
import hosp.DAL.DoctorDal;
import hosp.model.Doctor;

/**
 *
 * @author Glover
 */
public class DoctorController 
{
    protected DoctorDal doctorDal;
    public DoctorController() 
    {
        doctorDal = new DoctorDal();
    }
    
    public List<Doctor> getAllDoctor()
    {
        return doctorDal.selectAll();
    }
    
    public List<Doctor> getDoctorBySpecialization()
    {
        return doctorDal.selectBySpecialization();
    }
    
    public Doctor getDoctor(int id)
    {
        return doctorDal.selectById(id);
    }
     
    public int insertDoctor(Doctor doctor)
    {
        return doctorDal.insert(doctor);
    }
      
    public int updateDoctor(Doctor doctor)
    {
        return doctorDal.update(doctor);
    }
    
    public int deleteDoctorById(int id)
    {
        return doctorDal.delete(id);
    }
}

