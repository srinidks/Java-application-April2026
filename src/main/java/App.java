public class App {
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(GREEN + "Hello from Jenkins CI/CD!" + RESET);
    }
}
