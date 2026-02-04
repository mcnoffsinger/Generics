
public class test {
    public static void main(String[] args) {
        // Test with Strings

        System.out.println("\n\nTesting String list");
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Java");
        System.out.println("String Stack: " + stringStack);
        System.out.println("Peek: " + stringStack.peek());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Pushed \"String\" to stack");
        stringStack.push("String");
        System.out.println("Size: " + stringStack.getSize());
        System.out.println("Is empty?: " + stringStack.isEmpty());
        System.out.println("ToString: " + stringStack.toString());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Peek: " + stringStack.peek());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Size: " + stringStack.getSize());
        System.out.println("Is empty?: " + stringStack.isEmpty());


        // Test with Integers
        System.out.println("\n\nTesting Integer list");
        GenericStack<Integer> IntStack = new GenericStack<>();
        IntStack.push(10);
        IntStack.push(20);
        IntStack.push(30);
        System.out.println("Integer Stack: " + IntStack);
        System.out.println("Peek: " + IntStack.peek());
        System.out.println("Pop: " + IntStack.pop());
        System.out.println("Pushed \"67\" to stack");
        IntStack.push(67);
        System.out.println("Size: " + IntStack.getSize());
        System.out.println("Is empty?: " + IntStack.isEmpty());
        System.out.println("ToString: " + IntStack.toString());
        System.out.println("Pop: " + IntStack.pop());
        System.out.println("Pop: " + IntStack.pop());
        System.out.println("Peek: " + IntStack.peek());
        System.out.println("Pop: " + IntStack.pop());
        System.out.println("Size: " + IntStack.getSize());
        System.out.println("Is empty?: " + IntStack.isEmpty());
    }
}








