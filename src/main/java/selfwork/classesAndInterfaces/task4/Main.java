package selfwork.classesAndInterfaces.task4;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstname("John", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });

        user.setSurname("Smith", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });

        user.setAge(43, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >= 0 && input <= 150;
            }
        });
        user.setLogin("JohnSmith4", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });
        user.setPassword("Start123!", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });
        System.out.println(user);
    }
}
