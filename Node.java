/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_delivrey;

import java.util.ArrayList;

public class Node {
    
    private ArrayList<Edge> edge = new ArrayList<Edge>();
    private int distancefromsource =  Integer.MAX_VALUE;    
    private boolean visited;
    private String name;
    private int Id;

    public int getId() {
        return Id;
    }

    public Node(String name , int Id) {
        this.name = name;
        this.Id = Id;
    }    

    public String getName() {
        return name;
    }
    
    public int getDistancefromsource() {
        return distancefromsource;
    }

    public void setDistancefromsource(int distancefromsource) {
        this.distancefromsource = distancefromsource;
    }

    
    public boolean isVisted(){
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public ArrayList<Edge> getEdge() {
        return edge;
    }

    public void setEdge(ArrayList<Edge> edge) {
        this.edge = edge;
    }
    public void sort(){
        
    }
    
    public String toString(){
        return this.name ;
    }
}
