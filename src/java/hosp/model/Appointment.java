/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Glover
 */
public class Appointment {
    private int id;
    private int patient_id;
    private int doctor_id;
    private Date date;
    private int state_id;
    
    public Appointment() {
    }

    public Appointment(int id, int patient_id, int doctor_id, Date date, int state_id) {
        this.id = id;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.date = date;
        this.state_id = state_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + this.patient_id;
        hash = 37 * hash + this.doctor_id;
        hash = 37 * hash + Objects.hashCode(this.date);
        hash = 37 * hash + this.state_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Appointment other = (Appointment) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.patient_id != other.patient_id) {
            return false;
        }
        if (this.doctor_id != other.doctor_id) {
            return false;
        }
        if (this.state_id != other.state_id) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Appointment{" + "id=" + id + ", patient_id=" + patient_id + ", doctor_id=" + doctor_id + ", date=" + date + ", state_id=" + state_id + '}';
    }
}
