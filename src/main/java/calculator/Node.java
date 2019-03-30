package calculator;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {
     
    private String name;
     
    private Map<Node, Integer> adjacentDistance = new HashMap<>();
    private Map<Node, Integer> adjacentCost = new HashMap<>();
 
    public void addDistance(Node destination, int distance) {
        adjacentDistance.put(destination, distance);
    }
    
        public void addCost(Node destination, int cost) {
        adjacentCost.put(destination, cost);
    }
    
    public Node(String name) { //constructor define the name of node
        this.name = name;
    } 
}