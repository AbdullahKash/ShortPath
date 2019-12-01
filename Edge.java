/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_delivrey;

import javafx.scene.shape.Line;

/**
 *
 * @author sayg9
 */
public class Edge {

    private Node fromNodeIndex;
    private Node toNodeIndex;
    private int Linght;
    private Line line;


    public Edge(int linght , Node fromedage, Node toedge, Line line) {
        this.Linght = linght;
        this.fromNodeIndex = fromedage;
        this.toNodeIndex = toedge;
        this.line = line;
    }

    public Line getLine() {
        return this.line;
    }

    public Node getFromNodeIndex() {
        return fromNodeIndex;
    }

    public Node getToNodeIndex() {
        return toNodeIndex;
    }

    public int getLinght() {
        return Linght;
    }
    
    public String toString(){
        return "Edge lenght " + getLinght() + " from node " + getFromNodeIndex().toString() + " to node " + getToNodeIndex().toString();
    }
}
