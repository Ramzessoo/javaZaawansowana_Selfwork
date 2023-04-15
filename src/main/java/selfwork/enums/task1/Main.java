package selfwork.enums.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Is Sunday a holyday? - " + Weekday.SUNDAY.isHoliday());
        System.out.println("Is Friday a holyday? = " + Weekday.FRIDAY.isHoliday());
        System.out.println("Is Saturday a workday? = " + Weekday.SATURDAY.isWeekDay());

        System.out.print(Weekday.FRIDAY + " is ");
        Weekday.FRIDAY.whichIsGreater(Weekday.SATURDAY);
    }
}
