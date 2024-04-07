import java.util.ArrayList;

public class TStack<E> {
    private ArrayList<E> stack;

    public TStack() {//constructor initializes the stack ArrayList to store Elements of type E
        stack = new ArrayList<>();
    }

    public void push(E item) {
        stack.add(item);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public int deepLevel(E item){
        int level = -1; //last level
        for (int i = 0; i < stack.size(); i++){
            if(stack.get(i).equals(item)){
                level = stack.size() - 1 - i;
                break;
            }
        }
        return level;
    }

    public void removeBottom(){
        if(isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        stack.remove(0);
    }
}