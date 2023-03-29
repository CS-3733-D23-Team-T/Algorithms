public class Node {

    public String nodeid;
    public int x;
    public int y;

    // how we get our nodes
    public Node(String nodeid, int x, int y) {
        nodeid = nodeid;
        x = x;
        y =y;
    }

    public String getNodeid(){
        return nodeid;
    }

    public void setNodeid(String nodeid){
        nodeid = nodeid;
    }

    public int getX() {
        return x;
    }

    public void setx(int x) {
        x =x;
    }



    public int getY() {
        return y;
    }
    // Sets the Y position of a node
    public void sety() {
        y = y;
    }


}
