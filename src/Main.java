public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printMessage();
        greetings();
        printParameterValue("This is parameter value");
    }

    public static void printMessage(){
        System.out.println("Hi,All Welcome to the java programming!!");
    }

    private static void greetings(){
        System.out.println("Greetings All");
    }

    private static void printParameterValue(String value){
        System.out.println(value);
    }
}