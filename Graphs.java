import java.util.Scanner;
import java.util.*;
class Graph{    
    int nodesCount;
    ArrayList<String> nodes;
    ArrayList<ArrayList<Integer>> graph;
    public Graph(){
        nodesCount = 0;
        nodes= new ArrayList<>();
        graph= new ArrayList<>();
    }
    public void addnode(String v){
        if(nodes.contains(v)){
            System.out.println("The node already exists !!");
        }
        else{
            ++nodesCount;
            nodes.add(v);
            ArrayList<Integer> temp =  new ArrayList<>();
            for(int i=0;i<=nodesCount;i++){
                temp.add(0);
            }
            graph.add(temp);
            for(ArrayList row: graph){
                row.add(0);
            }
        }
    }
    
    public void addedge(String v1, String v2){
        if(!nodes.contains(v1)){
            System.out.println(v1+" node not exists.");
        }
        else if(!nodes.contains(v2)){
            System.out.println(v2+" node not exists.");
        }
        else{
            int index1=nodes.indexOf(v1);
            int index2=nodes.indexOf(v2);
            graph.get(index1).set(index2,1);
            graph.get(index2).set(index1,1);
        }
    }
    
    public void addedge_undirected(){
        
    }
    
    public void addedge_directed(){
        
    }
    
    public void print_graph(){
        System.out.print("   ");
        for (String node : nodes) {
            System.out.print(node + " ");
        }
        System.out.println();

        for (int i = 0; i < nodesount; i++) {

            System.out.print(nodes.get(i) + " ");

            for (int j = 0; j < nodesount; j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }

            System.out.println();
        }
    }
    
    public void delete(String v){
        if(!nodes.contains(v1)){
            System.out.println(v1+" node not exists in graph.");
        }
        else{
            int index = nodes.indexOf(v);
            nodes.remove(index);
            graph.remove(index);
            for(ArrayList row: graph){
                remove(index);
            }
            nodesCount--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Graph obj = new Graph();
        while(true){
            System.out.println("1. Add a node using Adjaqncy matrix representation");
            System.out.println("2. Add a edge using Adjaqncy matrix representation");
            System.out.println("3. Add a edge undirected weighted graph");
            System.out.println("4. Add a edge directed weighted graph");
            System.out.println("5. Print graph");
            System.out.println("6. Delete Operation");
            System.out.println("0. Exit");
            System.out.println(" ");
            System.out.println("Enter the choice:");
            int ch = sc.nextInt();
            switch(ch){
                case 1: System.out.print("Enter node name: ");
                        String node = sc.next();
                        obj.addNode(node);
                        break;
                case 2: obj.addedge();break;
                case 3: obj.addedge_undirected();break;
                case 4: obj.addedge_directed();break;
                case 5: obj.print_graph();break;
                case 6: obj.delete();break;
                case 7: System.exit(0);
            }
        }
    }
}
