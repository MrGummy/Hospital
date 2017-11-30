/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.DAL;

import hosp.model.Appointment;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Евгений Мартыненко General-zver
 */
public class AppointmentDal extends BaseDal {

    public AppointmentDal() {
        super();
    }
    public List<Appointment> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Appointment> list = session.selectList("appointment.selectAll");
         session.close();
         return list;
    }
    
    public Appointment selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Appointment appointment= session.selectOne("appointment.selectById",id);
         session.close();
         return appointment;
    }
    
    public int update(Appointment appointment)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("appointment.update",appointment);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Appointment appointment)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("appointment.insert",appointment);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("appointment.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
    
}
