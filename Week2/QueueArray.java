package Week2;
// Impelementation of circular array

public class QueueArray<Item> {
    Item[] queue;
    int front = 0;
    int back = 0;
    public QueueArray(int capacity){
        queue = (Item[]) new Object[capacity];
    }
    public void push(Item item){
       queue[back] = item;
       if(back == queue.length - 1){
        back = 0;
        return;
       }
       if(queue[back+1] == null){
        back++;
       }
       // resize array
    }
    public Item pop(){
        Item fronItem = queue[front];
        queue[front] = null;
        return fronItem;
    }
    // public boolean isEmpty() {
    // }
}
