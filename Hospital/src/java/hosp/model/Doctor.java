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
    private String user_name;
    private String password;
    
    public Doctor() {
    }

    public Doctor(int id, String fio, String specialization, String number_phone, byte[] photo, String user_name, String password) {
        this.id = id;
        this.fio = fio;
        this.specialization = specialization;
        this.number_phone = number_phone;
        this.photo = photo;
        this.user_name = user_name;
        this.password = password;
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

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
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

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.fio);
        hash = 53 * hash + Objects.hashCode(this.specialization);
        hash = 53 * hash + Objects.hashCode(this.number_phone);
        hash = 53 * hash + Arrays.hashCode(this.photo);
        hash = 53 * hash + Objects.hashCode(this.user_name);
        hash = 53 * hash + Objects.hashCode(this.password);
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
        if (!Objects.equals(this.fio, other.fio)) {
            return false;
        }
        if (!Objects.equals(this.specialization, other.specialization)) {
            return false;
        }
        if (!Objects.equals(this.number_phone, other.number_phone)) {
            return false;
        }
        if (!Objects.equals(this.user_name, other.user_name)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Arrays.equals(this.photo, other.photo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", fio=" + fio + ", specialization=" + specialization + ", number_phone=" + number_phone + ", photo=" + photo + ", user_name=" + user_name + ", password=" + password + '}';
    }
}
