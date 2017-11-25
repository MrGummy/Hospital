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
public class Patient 
{
    private int id;
    private String fio;
    private Date birth_date;
    
    public Patient(int id, String fio, Date birth_date) {
        this.id = id;
        this.fio = fio;
        this.birth_date = birth_date;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.fio);
        hash = 59 * hash + Objects.hashCode(this.birth_date);
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
        final Patient other = (Patient) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.fio, other.fio)) {
            return false;
        }
        if (!Objects.equals(this.birth_date, other.birth_date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", fio=" + fio + ", birth_date=" + birth_date + '}';
    }
}
