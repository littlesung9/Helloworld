/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.LinkedList;

/**
 *
 * @author mhee
 */

// seperate node path 
public class Path {
    private LinkedList<Node> path = new LinkedList<Node>(); 
    private int totaldistance = 0;
    private int totalcost  =  0;
        
    public Path(LinkedList<Node> pathnode){
        
    }
     
    
    public int gettotaldistance(){
        return this.totaldistance;
    }

    public int gettotalcost(){
        return this.totalcost;
    }
    
    

    public void addtotaldistance(int distance){
        
        this.totaldistance = this.totaldistance+distance;
    }
    
    public void addtotalcost(int cost){
        
        this.totalcost = this.totalcost+cost;
    }
    
   
    
    
        
}
    
