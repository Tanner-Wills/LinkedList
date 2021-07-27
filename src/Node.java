public class Node {
    //Instance Variables
    private Object data;
    private Node next;

    //Constructor
    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(Object data){
        this(data, null);
    }

    //Node Methods

}
