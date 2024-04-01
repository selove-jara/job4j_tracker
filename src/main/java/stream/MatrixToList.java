package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {

    public static List<Integer> convert(Integer[][] matrix) {
        List<Integer> collect = Arrays.stream(matrix)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        return collect;
    }
}