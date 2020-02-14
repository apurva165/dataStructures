package graphs.bfs;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFS {
    private ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    public BFS(ArrayList<GraphNode> listNode) {
        this.nodeList = listNode;
    }

    void bfd() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited()) {
                bfsVisit(node);
            }
        }
    }

   public void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
       System.out.println("Entring bfs Visit");
        while (!queue.isEmpty()) {
            System.out.println("Inside first while");
            // get first element
            GraphNode presentNode = queue.remove(0);
            //set visited to true
            presentNode.setVisited(true);
            System.out.println(presentNode.getName() + "  ");
            // traverse neighbors
            for (GraphNode neighbor : presentNode.getNeighbors()) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    public void addUndirectedEdge(int i, int j){
        GraphNode first = nodeList.get(i -1);
        GraphNode second = nodeList.get(j -1);
        first.getNeighbors().add(second);
        second.getNeighbors().add(first);
    }
}
