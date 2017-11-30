/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.DAL;

import java.util.List;
import hosp.model.Doctor;
import org.apache.ibatis.session.SqlSession;
/**
 *
 * @author Евгений Мартыненко General-zver
 */
public class DoctorDal extends BaseDal {

    public DoctorDal() {
        super();
    }
    public List<Doctor> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Doctor> list = session.selectList("doctor.selectAll");
         session.close();
         return list;
    }
    
    public List<Doctor> selectBySpecialization()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Doctor> list = session.selectList("doctor.selectBySpecialization");
         session.close();
         return list;
    }
    
    public Doctor selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Doctor doctor= session.selectOne("doctor.selectById",id);
         session.close();
         return doctor;
    }
    
    public int update(Doctor doctor)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("doctor.update",doctor);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Doctor doctor)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("doctor.insert",doctor);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("doctor.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
}

