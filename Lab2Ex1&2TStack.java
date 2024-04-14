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
        /*public E remove (int ind){
        if (ind < 0 || ind >= stack.size()) {
            throw new IndexOutOfBoundsException("Index: " + ind + ", Size: " + stack.size());
            }
            E removedItem = stack.get(ind);

            for (int i = ind; i < stck.size() - 1; i++) {
                stack.set(i, stack.get(i + 1));
            }

            stack.remove(stack.size() - 1);
            return removeItem;
        }*/
    }

    public boolean isEmpty() {
        return stack.isEmpty();
        /*public boolean isEmpty(){
        return stack.size() == 0;
        }*/
    }

    public int size() {
        return stack.size();

        /*public int size()
            {
            int count = 0;
            for(E item : stack){
                count++;
            }
            return count;
            }
            */
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
