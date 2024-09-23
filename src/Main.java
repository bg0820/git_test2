public class Main {

    public static void main(String[] args) {
        Hello hello = new Hello();
        Hello helloWorld = new Hello("Hello World");

        System.out.println(hello.say());
        System.out.println(helloWorld.say());
    }
}