//import edu.wpi.tacticaltritons.database.Node;
import java.util.ArrayList;
import java.util.List;

public class TestDirection{

    public static void main(String[] args) {
        // Initialize some nodes
        Node node1 = new Node("NodeTest1",0, 0);
        Node node2 = new Node("NodeTest2",4, 4);
        Node node3 = new Node("NodeTest3",5,5 );
        Node node4 = new Node("NodeTest4",1, 1);

        // Create a list and add the nodes
        List<Node> nodeList = new ArrayList<>();
        nodeList.add(node1);
        nodeList.add(node2);
        nodeList.add(node3);
        nodeList.add(node4);

        // Create a Direction instance with the nodeList
        Direction direction = new Direction(nodeList);

        // Test the position() method
        System.out.println("Expected output: Go Straight, Turn Left, Turn Right");
        direction.position();
    }
}
