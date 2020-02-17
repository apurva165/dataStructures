package graphs.singleshortestpath.bfs;

import java.util.ArrayList;
import java.util.LinkedList;

public class PathFindByBFS {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    public PathFindByBFS(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    //path of each Vertex from source
    public static void pathPrint(GraphNode node) {
        if (node.getParent() != null) {
            pathPrint(node.getParent());
            System.out.println(" -> " + node.getName() + " -> ");
        }
    }

    //BFS traversal by source node
    public void BFSForSSSP(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode presentNode = queue.remove();
            presentNode.setVisited(true);
            System.out.println("printing path for " + presentNode.getName());
            pathPrint(presentNode);
            for (GraphNode neighbor : presentNode.getNeighbors()) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                    neighbor.setParent(presentNode);
                }
            }
        }
    }
    // add an undirected edge between two nodes
    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.getNeighbors().add(second);
        second.getNeighbors().add(first);
    }//end of method
}
