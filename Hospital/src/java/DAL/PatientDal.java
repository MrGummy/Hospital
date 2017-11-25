/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import hosp.model.Patient;
import org.apache.ibatis.session.SqlSession;
/**
 *
 * @author Евгений Мартыненко General-zver
 */
public class PatientDal extends BaseDal {

    public PatientDal() {
        super();
    }
    public List<Patient> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Patient> list = session.selectList("patient.selectAll");
         session.close();
         return list;
    }
    
    public Patient selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Patient patient= session.selectOne("patient.selectById",id);
         session.close();
         return patient;
    }
    
    public int update(Patient patient)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("patient.update",patient);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Patient patient)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("patient.insert",patient);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("patient.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
}
