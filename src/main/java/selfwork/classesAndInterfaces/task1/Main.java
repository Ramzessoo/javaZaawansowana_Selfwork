package selfwork.classesAndInterfaces.task1;

public class Main {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String[] results = userValidator.validateEmails("pd@", "@yahoo.com");
        System.out.println(results[0]);
        System.out.println(results[1]);
    }
}
