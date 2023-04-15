package selfwork.classesAndInterfaces.task4;

public class User {

    String firstname;
    String surname;
    int age;
    String login;
    String password;

    public User() {
    }

    public User(String firstname, String surname, int age, String login, String password) {
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
        this.login = login;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname, Validator<String> validator) {
        if (validator.validate(firstname))
            this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname, Validator<String> validator) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, Validator<Integer> validator) {
        if (validator.validate(age))
            this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login, Validator<String> validator) {
        if (validator.validate(login))
            this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, Validator<String> validator) {
        if (validator.validate(password))
            this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
