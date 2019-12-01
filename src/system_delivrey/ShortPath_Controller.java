/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_delivrey;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.collections.FXCollections;
import java.util.Collections;

public class ShortPath_Controller implements Initializable {

    @FXML
    private ImageView img1;
    @FXML
    private ImageView img2;
    @FXML
    private ImageView img6;
    @FXML
    private ImageView img3;
    @FXML
    private ImageView img4;
    @FXML
    private ImageView img5;
    @FXML
    private ImageView img9;
    @FXML
    private ImageView img7;
    @FXML
    private ImageView img8;
    @FXML
    private Button btnShortPath;
    @FXML
    private Line edg1;
    @FXML
    private Line edg2;
    @FXML
    private Line edg3;
    @FXML
    private Line edg4;
    @FXML
    private Line edg5;
    @FXML
    private Line edg6;
    @FXML   
    private Line edg7;
    @FXML
    private Line edg8;
    @FXML
    private Line edg9;
    @FXML
    private Line edg10;
    @FXML
    private Line edg11;
    @FXML
    private Line edg12;
    @FXML
    private Line edg13;
    @FXML
    private Line edg14;
   
    public ArrayList<Node> nodes;
    @FXML
    private Label w0;
    @FXML
    private ChoiceBox<Node> nodeStart;
    @FXML
    private ChoiceBox<Node> nodeEnd;
    @FXML
    private Button Clear;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Excute();
    }

    public void Excute() {
        //creat the nodes from class Node 
        Node img1 = new Node("Branche1", 1);
        Node img2 = new Node("Branche2", 2);
        Node img3 = new Node("Branche3", 3);
        Node img4 = new Node("Branche4", 4);
        Node img5 = new Node("Branche5", 5);
        Node img6 = new Node("Branche6", 6);
        Node img7 = new Node("Branche7", 7);
        Node img8 = new Node("Branche8", 8);
        Node img9 = new Node("Branche9", 9);

        // creat the edges from class Edge and connection the edges(scene bulider) , nodes(that creat from class Node) , weight , node(scene bulider)  
        Edge edge1 = new Edge(4, img1, img2, this.edg1);
        Edge edge2 = new Edge(5, img1, img8, this.edg2);
        Edge edge3 = new Edge(8, img2, img3, this.edg3);
        Edge edge4 = new Edge(11, img2, img8, this.edg4);
        Edge edge5 = new Edge(4, img2, img1, this.edg1);
        Edge edge6 = new Edge(1, img3, img4, this.edg5);
        Edge edge7 = new Edge(4, img3, img6, this.edg6);
        Edge edge8 = new Edge(2, img3, img9, this.edg7);
        Edge edge9 = new Edge(8, img3, img2, this.edg3);
        Edge edge10 = new Edge(9, img4, img5, this.edg8);
        Edge edge11 = new Edge(14, img4, img6, this.edg9);
        Edge edge12 = new Edge(7, img4, img3, this.edg5);
        Edge edge13 = new Edge(10, img5, img6, this.edg10);
        Edge edge14 = new Edge(9, img5, img4, this.edg8);
        Edge edge15 = new Edge(10, img6, img5, this.edg10);
        Edge edge16 = new Edge(14, img6, img4, this.edg9);
        Edge edge17 = new Edge(4, img6, img3, this.edg6);
        Edge edge18 = new Edge(2, img6, img7, this.edg11);
        Edge edge19 = new Edge(6, img7, img9, this.edg12);
        Edge edge20 = new Edge(1, img7, img8, this.edg13);
        Edge edge21 = new Edge(2, img7, img6, this.edg11);
        Edge edge22 = new Edge(7, img8, img9, this.edg14);
        Edge edge23 = new Edge(11, img8, img2, this.edg4);
        Edge edge24 = new Edge(5, img8, img1, this.edg2);
        Edge edge25 = new Edge(1, img8, img7, this.edg13);
        Edge edge26 = new Edge(7, img9, img8, this.edg14);
        Edge edge27 = new Edge(2, img9, img3, this.edg7);
        Edge edge28 = new Edge(6, img9, img7, this.edg12);

        //System.out.println(edg1.getId());
        // add per the node the edges them to it
        ArrayList img1Edges = new ArrayList<>();
        img1Edges.add(edge1);
        img1Edges.add(edge2);
        img1.setEdge(img1Edges);
        //Collections.sort(img1Edges);
        //----------------------------------------------------------------
        ArrayList img2Edges = new ArrayList<>();
        img2Edges.add(edge3);
        img2Edges.add(edge4);
        img2Edges.add(edge5);
        img2.setEdge(img2Edges);
        //Collections.sort(img2Edges);
        //----------------------------------------------------------------
        ArrayList img3Edges = new ArrayList<>();
        img3Edges.add(edge6);
        img3Edges.add(edge7);
        img3Edges.add(edge8);
        img3Edges.add(edge9);
        img3.setEdge(img3Edges);
        //Collections.sort(img3Edges);
        //----------------------------------------------------------------
        ArrayList img4Edges = new ArrayList<>();
        img4Edges.add(edge10);
        img4Edges.add(edge11);
        img4Edges.add(edge12);
        img4.setEdge(img4Edges);
        //Collections.sort(img4Edges);
        //----------------------------------------------------------------
        ArrayList img5Edges = new ArrayList<>();
        img5Edges.add(edge13);
        img5Edges.add(edge14);
        img5.setEdge(img5Edges);
        //Collections.sort(img5Edges);
        //----------------------------------------------------------------
        ArrayList img6Edges = new ArrayList<>();
        img6Edges.add(edge15);
        img6Edges.add(edge16);
        img6Edges.add(edge17);
        img6Edges.add(edge18);
        img6.setEdge(img6Edges);
        //Collections.sort(img6Edges);
        //----------------------------------------------------------------
        ArrayList img7Edges = new ArrayList<>();
        img7Edges.add(edge19);
        img7Edges.add(edge20);
        img7Edges.add(edge21);
        img7.setEdge(img7Edges);
        //Collections.sort(img7Edges);
        //----------------------------------------------------------------
        ArrayList img8Edges = new ArrayList<>();
        img8Edges.add(edge22);
        img8Edges.add(edge23);
        img8Edges.add(edge24);
        img8Edges.add(edge25);
        img8.setEdge(img8Edges);
        //Collections.sort(img8Edges);
        //----------------------------------------------------------------
        ArrayList img9Edges = new ArrayList<>();
        img9Edges.add(edge26);
        img9Edges.add(edge27);
        img9Edges.add(edge28);
        img9.setEdge(img9Edges);
        //Collections.sort(img9Edges);

        // Add all the nodes in array 
        nodes = new ArrayList<>();
        nodes.add(img1);
        nodes.add(img2);
        nodes.add(img3);
        nodes.add(img4);
        nodes.add(img5);
        nodes.add(img6);
        nodes.add(img7);
        nodes.add(img8);
        nodes.add(img9);

        ObservableList<Node> userobserblood = FXCollections.observableArrayList(nodes);
        nodeStart.getItems().addAll(userobserblood);
        nodeStart.setPrefWidth(150);
        ObservableList<Node> uuserobserblood = FXCollections.observableArrayList(nodes);
        nodeEnd.getItems().addAll(uuserobserblood);
        nodeEnd.setPrefWidth(150);
    }


    public void run( Node node ){
         Node nodeend = nodeEnd.getValue();
        if ((node.getName() == nodeend.getName()) || node.isVisted()) {
            return;
        } else {
            node.setVisited(true);
            ArrayList<Edge> edges = node.getEdge();
            Edge shortEdge = edges.get(0);

            if (edges.size() > 1) {
                for (int i = 0; i < edges.size(); i++) {
                    if (edges.get(i).getLinght() <= shortEdge.getLinght()) {
                        if (edges.get(i).getToNodeIndex().isVisted()) {
                            shortEdge = shortEdge;
                        } else {
                            shortEdge = edges.get(i);
                        }
                    } else {
                        if (shortEdge.getToNodeIndex().isVisted()) {
                            shortEdge = edges.get(i);
                        } else {
                            shortEdge = shortEdge;

                        }
                    }
                }
            }
            /*
                for (int i = 0 ; i<edges.size() ; i++){
                    for (int j = edges.indexOf(edges.get(i))+1 ; j<edges.size() ; j++){
                        if(edges.get(i).getLinght() <= edges.get(j).getLinght()){
                            if(edges.get(i).getToNodeIndex().isVisted()){
                                shortEdge = edges.get(j);
                            }
                            else{
                                shortEdge = edges.get(i);
                            }
                        }
                        else{
                            if(edges.get(j).getToNodeIndex().isVisted()){
                                shortEdge = edges.get(i);
                            }
                            else{
                                shortEdge = edges.get(j);
                                
                            }
                        }
                    }
                }
             */
            shortEdge.getLine().setStroke(Color.RED);
            System.out.println("" + shortEdge.toString());
            run(shortEdge.getToNodeIndex());
        }
    } 

//    public boolean checkNodes(Node node) {
//        Node nodeend = nodeEnd.getValue();
//        for (Node nodes : nodes) {
//            if (nodefrom.getName() != nodeend.getName()) {
//                return true;
//            }
//        }
//        return false;
//    }

    @FXML
    private void ShortPath(ActionEvent event) {
        Node nodefrom  = nodeStart.getValue();
        run(nodefrom);
    }

    @FXML
    private void Clear(ActionEvent event) {
        
    }

}
