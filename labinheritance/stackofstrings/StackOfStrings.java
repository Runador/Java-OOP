package stackofstrings;

import java.util.ArrayList;

public class StackOfStrings {

    private ArrayList<String> data;

    public StackOfStrings() {
        data = new ArrayList<>();
    }

    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        String lastElement = data.getLast();
        data.remove(lastElement);
        return lastElement;
    }

    public String peek() {
        return data.getLast();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int getSize() {
        return data.size();
    }
}
