import java.util.NoSuchElementException;

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

        Node<T> newNode = new Node<>(data);

        //Edge cases
        //#1 if the list is empty
        if(size == 0) {
            this.head = newNode;
            this.tail = newNode;
        }

        //#2 if the index == 0
        else if(index == 0) {
            Node<T> oldHead = this.head;
            this.head = newNode;
            newNode.setNext(oldHead);
        }

        //#3 if the index is == size
        else if(index == size) {
            Node<T> oldTail = this.tail;
            this.tail = newNode;
            oldTail.setNext(newNode);

        //End of Edge Cases
        } else {
            //Capture previous node by looping through the list starting at the head node.
            Node<T> prevNode = this.head;
            for (int i = 0; i < index - 1; i++)
                prevNode = prevNode.getNext();

            //Insert the new Node at the current index and point it to the next Node.
            Node<T> currNode = prevNode.getNext();
            prevNode.setNext(newNode);
            newNode.setNext(currNode);
        }
        //Increment the size of the Linked List + 1.
        this.size += 1;
        }
    }

    @Override
    public T getAtIndex(int index) {
        if(index < 0 || index > size -1){
            throw new IllegalArgumentException("Your index is out of the list bounds");
        } else {
            Node<T> curr = this.head;
            for(int i = 0; i < index; i++){
                curr = curr.getNext();
            }
            return curr.getData();
        }
    }

    @Override
    public T removeAtIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Your index is out of the list bounds");
        } else {
            Node<T> prev = this.head;
            //If head node needs to be removed (index == 0)
            if (index == 0) {
                Node<T> newHead = prev.getNext();
                prev.setNext(newHead);
                size -= 1;
                return prev.getData();

            } else {
                for (int i = 0; i < index - 1; i++) {
                    prev = prev.getNext();
                }
                Node<T> removeNode = prev.getNext();
                Node<T> prevNextNext = prev.getNext().getNext();
                prev.setNext(prevNextNext);
                size -= 1;
                return removeNode.getData();
            }
        }
    }

    @Override
    public T remove(T data) {
        //Removes the first occurrence of the passed data from the list (and also remove the node that holds it) and returns the data from the removed node
        if(data == null){
            throw new IllegalArgumentException("You cannot remove null data from the list");
        } else {
            Node<T> prev = this.head;
            Node<T> curr = this.head.getNext();

            //If head node needs to be removed
            if(this.head.getData() == data){
                T oldHead = head.getData();
                head.setData(curr.getData());
                head.setNext(curr.getNext());
                this.size -= 1;
                return oldHead;
            }
            //If another node needs to be removed
            for(int i = 0; i < size-1; i++){
                if(curr.getData() == data){
                    prev.setNext(prev.getNext().getNext());
                    this.size -= 1;
                    return curr.getData();
                }
                prev = prev.getNext();
                curr = curr.getNext();
            }
            throw new NoSuchElementException("The data is not present in the list");
        }
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    @Override
    public boolean isEmpty() {
        if(this.size == 0){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }
}
