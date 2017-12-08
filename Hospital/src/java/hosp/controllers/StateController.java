/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.controllers;

import java.util.List;
import hosp.DAL.StateDal;
import hosp.model.State;

/**
 *
 * @author Glover
 */
public class StateController 
{
    protected StateDal stateDal;
    public StateController() 
    {
        stateDal = new StateDal();
    }
    
    public List<State> getAllState()
    {
        return stateDal.selectAll();
    }
    
    public State getState(int id)
    {
        return stateDal.selectById(id);
    }
}