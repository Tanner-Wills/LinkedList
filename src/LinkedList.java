public class LinkedList <T> implements List<T>{

    //Instance Variables
    private Node<T> head;
    private Node<T> tail;
    private int size;

    //Constructors
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    //Getters
    public Node<T> getHead(){
        return this.head;
    }
    public Node<T> getTail(){
        return this.tail;
    }

    //Linked List Methods
    @Override
    public void addAtIndex(T data, int index){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Your index is out of the list bounds");
        } else if (data == null) {
            throw new IllegalArgumentException("You cannot add null data to the list");
        } else {
            if (index == 0){
                this.head
            }
            this.size += 1;

        }
    }

    @Override
    public T getAtIndex(int index) {
        return null;
    }

    @Override
    public T removeAtIndex(int index) {
        return null;
    }

    @Override
    public T remove(T data) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
