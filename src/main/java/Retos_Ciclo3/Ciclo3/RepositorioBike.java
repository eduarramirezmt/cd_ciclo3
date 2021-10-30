/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos_Ciclo3.Ciclo3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ramirez Sanchez
 */
@Repository
public class RepositorioBike {
    
    
    @Autowired
	    private InterfaceBike crud;
	
	    public List<Bike> getAll(){
	        return (List<Bike>) crud.findAll();
	    }
	
	    public Optional<Bike> getBike(int id){
	        return crud.findById(id);
	    }
	
	    public Bike save(Bike bike){
	        return crud.save(bike);
	    }
	    public void delete(Bike bike){
	        crud.delete(bike);
	    }
}