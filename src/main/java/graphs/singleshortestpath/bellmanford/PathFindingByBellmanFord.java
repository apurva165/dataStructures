package graphs.singleshortestpath.bellmanford;

import java.util.ArrayList;

public class PathFindingByBellmanFord {
    ArrayList<WeightNode> nodeList = new ArrayList<>();

    public PathFindingByBellmanFord(ArrayList<WeightNode> nodeList) {
        this.nodeList = nodeList;
        for (WeightNode aNode : nodeList) {
            aNode.setDistance(Integer.MAX_VALUE / 10);
        }
    }

    private static void pathPrint(WeightNode node) {
        if (node.getParent() != null) {
            pathPrint(node.getParent());
            System.out.print("->" + node);
        } else
            System.out.print(node);
    }//end of method

    void bellmanFord(WeightNode sourceNode) {
        sourceNode.setDistance(0);
        for (int i = 0; i <= nodeList.size(); i++) {
            for (WeightNode presentNode : nodeList) {
                for (WeightNode neighbor : presentNode.getNeighbors()) {
                    if (neighbor.getDistance() > (presentNode.getDistance() + presentNode.getWeighMap().get(neighbor))) {
                        neighbor.setDistance((presentNode.getDistance() + presentNode.getWeighMap().get(neighbor)));
                        neighbor.setParent(presentNode);
                    }
                }
            }
        }

    }

    // add a weighted edge between two nodes
    public void addWeightedEdge(int i, int j, int d) {
        WeightNode first = nodeList.get(i - 1);
        WeightNode second = nodeList.get(j - 1);
        first.getNeighbors().add(second);
        first.getWeighMap().put(second, d);
    }//end of method

}
