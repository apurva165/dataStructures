package graphs.singleshortestpath.dijkstra;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PathFindingByDijkstra {
    ArrayList<WeightNode> nodeList = new ArrayList<>();

    public PathFindingByDijkstra(ArrayList<WeightNode> nodeList) {
        this.nodeList = nodeList;
    }

    private static void pathPrint(WeightNode node) {
        if (node.getParent() != null) {
            pathPrint(node.getParent());
            System.out.print("->" + node);
        } else
            System.out.print(node);
    }//end of method

    void dijkstra(WeightNode node) {
        PriorityQueue<WeightNode> queue = new PriorityQueue<>();
        node.setDistance(0); //This will make sure that we start from this vertex in priority queue as distance is min
        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightNode presentNode = queue.remove(); //remove node with minimum distance from queue
            for (WeightNode neighbor : presentNode.getNeighbors()) { //for each neighbor
                if (queue.contains(neighbor)) { //if neighbor is not visited
                    // if 'known distance' of neighbor is greater than new path then,
                    // update 'distance' of neighbor
                    // and also new parent as presentNode
                    if (neighbor.getDistance() > (presentNode.getDistance() + presentNode.getWeighMap().get(neighbor))) {
                        neighbor.setDistance((presentNode.getDistance() + presentNode.getWeighMap().get(neighbor)));
                        neighbor.setParent(presentNode);
                        //Refresh the Priority Queue
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }//end of if block
                }//end of if block
            }//end of for loop
        }//end of while loop


        //print table of node with minimum distance and shortest path from source
        for (WeightNode nodeToCheck : nodeList) {
            System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.getDistance() + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }//end of method

    // add a weighted directed edge between two nodes
    public void addWeightedEdge(int i, int j, int d) {
        WeightNode first = nodeList.get(i - 1);
        WeightNode second = nodeList.get(j - 1);
        first.getNeighbors().add(second);
        first.getWeighMap().put(second, d);
    }//end of method

}
