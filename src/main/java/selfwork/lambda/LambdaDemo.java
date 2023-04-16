package selfwork.lambda;

public class LambdaDemo {
    public static void main(String[] args) {


        Action action = (x, y) -> x + "-" + y;

        Runnable runnableExample = () -> {
            System.out.println("Hello from runnable");
            System.out.println("{ and } cannot be omitted");
        };

        runnableExample.run();
    }
}