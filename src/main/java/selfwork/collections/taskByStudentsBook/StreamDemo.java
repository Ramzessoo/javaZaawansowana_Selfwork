package selfwork.collections.taskByStudentsBook;

import java.util.Arrays;

public class StreamDemo {
    public static void main(String[] args) {

        int result = Arrays.stream(new int[]{1, 2, 3})
                .map(x -> x * 66)
                .sum();

        System.out.println(result);
    }

}
