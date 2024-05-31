package Week2;

public class Node<Item> {
    Item item;
    Node next;
    public Node() {
        this.item = null;
        this.next = null;
    }
    public Item getItem(){
        return this.item;
    }
    
}
