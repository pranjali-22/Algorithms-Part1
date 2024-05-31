package Week2;
// Data Structure - Array
// Stack Implementation using Array

public class StackArray<Item> {
    private int top; // mainatins a pointer to the top index of the stack
    private Item[] arr;
    public StackArray(int capacity) {
        arr = new Item[capacity];
        top = -1;
    }
    void push(Item item) {
        arr[top] = item;
        top++;
    }
    Item pop() {
        return arr[--top];
    }
    boolean isEmpty() {
        return top == -1;
    }


    
}
