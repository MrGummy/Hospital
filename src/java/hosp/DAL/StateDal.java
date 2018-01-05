/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.DAL;

import java.util.List;
import hosp.model.State;
import org.apache.ibatis.session.SqlSession;
/**
 *
 * @author Евгений Мартыненко General-zver
 */
public class StateDal extends BaseDal {

    public StateDal() {
        super();
    }
    public List<State> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<State> list = session.selectList("state.selectAll");
         session.close();
         return list;
    }
    
    public State selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         State state= session.selectOne("state.selectById",id);
         session.close();
         return state;
    }
}
