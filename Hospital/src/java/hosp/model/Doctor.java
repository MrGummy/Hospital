/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.model;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Glover, General-zver
 */
public class Doctor {

    private int id;
    private String fio;
    private String specialization;
    private String number_phone;
    private byte[] photo;
    
    public Doctor() {
    }

    public Doctor(int id, String fio, String specialization, String number_phone, byte[] photo) {
        this.id = id;
        this.fio = fio;
        this.specialization = specialization;
        this.number_phone = number_phone;
        this.photo = photo;
    }

    Doctor(int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getNumber_phone() {
        return number_phone;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setNumber_phone(String number_phone) {
        this.number_phone = number_phone;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.fio);
        hash = 23 * hash + Objects.hashCode(this.specialization);
        hash = 23 * hash + Objects.hashCode(this.number_phone);
        hash = 23 * hash + Arrays.hashCode(this.photo);
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
        final Doctor other = (Doctor) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.number_phone != other.number_phone) {
            return false;
        }
        if (!Objects.equals(this.fio, other.fio)) {
            return false;
        }
        if (!Objects.equals(this.specialization, other.specialization)) {
            return false;
        }
        if (!Arrays.equals(this.photo, other.photo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", fio=" + fio + ", specialization=" + specialization + ", number_phone=" + number_phone + ", photo=" + photo + '}';
    }
}
