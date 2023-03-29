public class NodeComparator implements java.util.Comparator<Integer> {
    // Comparator class for priority queue
     final private int[][] nodes;

    public NodeComparator(int[][] nodes) {
        this.nodes = nodes;
    }

    // Compare nodes based on their f values (f = g + h)
    public int compare(Integer node1, Integer node2) {
        int f1 = nodes[node1][2] + (int) aStar.manhattanDistance(node1, node2);
        int f2 = nodes[node2][2] + (int) aStar.manhattanDistance(node2, node1);
        return Integer.compare(f1, f2);
    }
}

