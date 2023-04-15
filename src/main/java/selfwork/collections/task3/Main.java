package selfwork.collections.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i <= 100; i++){
            values.add(random.nextInt(50));
        }
        Set<Integer> uniqueValues = new HashSet<>();
        Set<Integer> duplicateValues = new HashSet<>();
        for (Integer value : values) {
            if (!uniqueValues.add(value)) {
                duplicateValues.add(value);
            }
        }

        System.out.println(uniqueValues);
        System.out.println(duplicateValues);
    }
}
