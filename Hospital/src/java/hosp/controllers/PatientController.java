/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.controllers;

import java.util.List;
import hosp.DAL.PatientDal;
import hosp.model.Patient;

/**
 *
 * @author Glover
 */
public class PatientController 
{
    protected PatientDal patientDal;
    public PatientController() 
    {
        patientDal = new PatientDal();
    }
    
    public List<Patient> getAllPatient()
    {
        return patientDal.selectAll();
    }
    
    public Patient getPatient(int id)
    {
        return patientDal.selectById(id);
    }
     
    public int insertPatient(Patient patient)
    {
        return patientDal.insert(patient);
    }
      
    public int updatePatient(Patient patient)
    {
        return patientDal.update(patient);
    }
    
    public int deletePatientById(int id)
    {
        return patientDal.delete(id);
    }
}
