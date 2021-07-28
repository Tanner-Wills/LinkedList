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

    //Getters
    public E getData(){
        return this.data;
    }
    public Node<E> getNext(){
        return this.next;
    }

    //Setters
    public void setData(E data){
        this.data = data;
    }
    public void setNext(Node<E> next){
        this.next = next;
    }
}
