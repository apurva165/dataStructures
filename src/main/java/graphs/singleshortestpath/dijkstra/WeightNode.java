package graphs.singleshortestpath.dijkstra;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightNode {
    public String name;

    private ArrayList<WeightNode> neighbors = new ArrayList<>();
    private HashMap<WeightNode , Integer> weighMap = new HashMap<>();
    private boolean isVisited = false;
    private WeightNode parent;
    private int distance;

    public WeightNode(String name) {
        this.name = name;
        this.distance = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<WeightNode> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(ArrayList<WeightNode> neighbors) {
        this.neighbors = neighbors;
    }

    public HashMap<WeightNode, Integer> getWeighMap() {
        return weighMap;
    }

    public void setWeighMap(HashMap<WeightNode, Integer> weighMap) {
        this.weighMap = weighMap;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public WeightNode getParent() {
        return parent;
    }

    public void setParent(WeightNode parent) {
        this.parent = parent;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    public int compareTo(WeightNode o){
//        return this.distance - o.distance;
//    }
}
