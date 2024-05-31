package Week2;

// maintain a pointer to the top node

public class StackLinkedList<Item> {
    private Node top = null;
    
    public void push(Item item){
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = top;
        top = newNode;
    }
    public Item pop(){
        if(top == null) {
            return null;
        }
        Item topItem = new top.getItem() ;
        top = top.next;
        return topItem;
    }
    public boolean isEmpty() {
        return top == null;
    }
}
