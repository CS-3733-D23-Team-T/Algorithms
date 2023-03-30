import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class aStar {

    // A* search algorithm with Manhattan distance as heuristic
    public static List<Integer> aStar(int startNode, int endNode, int[][] nodes) {
        PriorityQueue<Integer> openList = new PriorityQueue<>(new NodeComparator(nodes));
        Map<Integer, Integer> nodeToPrevNode = new HashMap<>(); // map to store previous nodes
        Map<Integer, Integer> nodeToCost = new HashMap<>(); // map to store costs
        List<Integer> closedList = new ArrayList<>();

        // Set the start node's cost to 0 and add it to the open list
        nodeToCost.put(startNode, 0);
        openList.add(startNode);

        while (!openList.isEmpty()) {
            int current = openList.poll();

            // If we've reached the end node, construct the path and return it
            if (current == endNode) {
                return constructPath(endNode, nodeToPrevNode);
            }

            closedList.add(current);

            // Check all neighboring nodes
            for (int i = 0; i < nodes.length; i++) {
                int neighbor = i;
                int distance = (int) manhattanDistance(current, neighbor);

                // Skip this neighbor if it's already in the closed list or if it's not reachable
                if (closedList.contains(neighbor) || distance == Integer.MAX_VALUE) {
                    continue;
                }

                // Calculate the new cost to get to this neighbor via the current node
                int newCost = nodeToCost.get(current) + distance;

                // If the new cost is lower than the neighbor's current cost or if the neighbor is not in the open list,
                // update the neighbor's cost and previous node and add it to the open list
                if (!nodeToCost.containsKey(neighbor) || newCost < nodeToCost.get(neighbor)) {
                    nodeToCost.put(neighbor, newCost);
                    nodeToPrevNode.put(neighbor, current);
                    if (!openList.contains(neighbor)) {
                        openList.add(neighbor);
                    }
                }
            }
        }

        // If we get here, there is no path from the start node to the end node
        return null;
    }

    // calculate Manhattan distance between two nodes
    public static double manhattanDistance(int node1, int node2) {
        int x1 = node1 / 10; // calculate x-coordinate of node1
        int y1 = node1 % 10; // calculate y-coordinate of node1
        int x2 = node2 / 10; // calculate x-coordinate of node2
        int y2 = node2 % 10; // calculate y-coordinate of node2
        return Math.abs(x1 - x2) + Math.abs(y1 - y2); // calculate Manhattan distance
    }

    // construct path from start node to end node using previous nodes
    public static List<Integer> constructPath(int end, Map<Integer, Integer> nodeToPrevNode) {
        List<Integer> path = new ArrayList<>(); // list to store path
        int current = end; // start with end node
        while (nodeToPrevNode.containsKey(current)) { // loop while current node has a previous node
            path.add(current); // add current node to path
            current = nodeToPrevNode.get(current); // update current node to previous node
        }
        path.add(current); // add start node to path
        Collections.reverse(path);
        return path; // return path
    }
}
