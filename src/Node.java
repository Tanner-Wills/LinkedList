public class Node<E> {
    //Instance Variables
    private E data;
    private Node<E> next;

    //Constructor
    public Node(E data, Node<E> next){
        this.data = data;
        this.next = next;
    }

    public Node(E data){
        this(data, null);
    }

    //Node Methods

}
