import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] nodes = { /* Your node data here */ };
        int startNode = 0;
        int endNode = 1;

        List<Integer> path = aStar.aStar(startNode, endNode, nodes);

        if (path != null) {
            System.out.println("Shortest path from node " + startNode + " to node " + endNode + ":");
            for (int node : path) {
                System.out.print(node + " ");
            }
        } else {
            System.out.println("There is no path from node " + startNode + " to node " + endNode);
        }
    }
}
