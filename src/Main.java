public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        greetings();
        printParameterValue("This is parameter value");
    }

    private static void greetings(){
        System.out.println("Greetings All");
    }

    private static void printParameterValue(String value){
        System.out.println(value);
    }
}