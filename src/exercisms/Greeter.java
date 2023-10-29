package exercisms;
public class Greeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.getGreeting());
    }

    public String getGreeting() {
        return "Hello, World!";
    }
}