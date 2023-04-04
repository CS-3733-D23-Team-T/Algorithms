public class Node {

    private String nodeid;
    private int x;
    private int y;

    // how we get our nodes
    public Node(String nodeid, int x, int y) {
        this.nodeid = nodeid;
        this.x = x;
        this.y =y;
    }

    public String getNodeid(){

        return nodeid;
    }

    public void setNodeid(String nodeid) {

        this.nodeid = nodeid;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x =x;
    }



    public int getY() {
        return y;
    }
    // Sets the Y position of a node
    public void sety() {

        this.y = y;
    }


}
