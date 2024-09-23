public class Hello {
    private String message;

    public Hello() {
        this("Hello");
    }

    public Hello(String message) {
        this.message = message;
    }

    public String say() {
        return message;
    }
}
