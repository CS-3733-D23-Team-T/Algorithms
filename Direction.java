import java.util.List;
public class Direction {
    public Node currentNode;
    public Node nextNode;
    public List<Node> nodeList;

    public Direction(List<Node> node) {
        this.nodeList = node;
    }

    public int position() {
        if (nodeList == null || nodeList.size() < 2) {
            System.out.println("Error");
        }

        for (int i = 1; i < nodeList.size(); i++) {
            currentNode = nodeList.get(i - 1);
            nextNode = nodeList.get(i);

            int currentX = currentNode.getX();
            int nextX = nextNode.getX();
            int currentY = currentNode.getY();
            int nextY = nextNode.getY();

//            int updateX = currentX - nextX;
//            int updateY = currentY - nextY;

            if (currentX < nextX && currentY > nextY) {
                System.out.println("Turn Left");
                System.out.println("currentX < nextX && currentY > nextY");
            } else if (currentX > nextX && currentY > nextY) {
                System.out.println("Turn Right");
                System.out.println("currentX > nextX && currentY > nextY");
            } else if (currentX == nextX && currentY > nextY) {
                System.out.println("Go Straight");

            }

            else if (currentX < nextX && currentY < nextY) {
                System.out.println("Turn Right");
                System.out.print("currentX < nextX && currentY < nextY");
            }

            else if (currentX > nextX && currentY < nextY) {
                System.out.println("Turn Turn Left");
                System.out.print("currentX > nextX && currentY < nextY");



            } else if (currentX == nextX && currentY < nextY) {
                System.out.println("Go Straight");
                System.out.print("currentX == nextX && currentY < nextY");


            } else if (currentX == nextX && currentY == nextY) {
                System.out.println("You are already Here");
                System.out.print("currentX == nextX && currentY == nextY");
            }
        }

        return nextNode.getX(); // Returning nextNode.getX() as a default value, consider changing this to a more meaningful value.
    }
}


