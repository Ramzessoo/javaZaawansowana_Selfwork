package selfwork.enums.task2;

public class Main {
    public static void main(String[] args) {
        PackageSize packageSize = PackageSize.getPackageSize(42, 60);

        System.out.println(packageSize);
    }
}
