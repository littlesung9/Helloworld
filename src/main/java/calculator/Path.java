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
public class Path {
    private LinkedList<Node> path = new LinkedList<Node>(); 
    private int totaldistance = 0;
    private int totalcost  =  0;
        
    public Path(LinkedList<Node> pathnode){
     }
    
    public void settotaldistance(int distance){
        this.totaldistance = distance;
    }
    
        public void settotalcost(int cost){
        this.totalcost = cost;
    }
     
    
    public int gettotaldistance(){
        return this.totaldistance;
    }

    public int gettotalcost(){
        return this.totalcost;
    }
    
   
    
    
        
}
    
