package stackofstrings;

public class Main {
    public static void main(String[] args) {

        StackOfStrings stack = new StackOfStrings();

        stack.push("Runador");
        stack.push("Olga");
        stack.push("Sasha");
        System.out.println(stack.isEmpty());
        System.out.println(stack.getSize());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}
