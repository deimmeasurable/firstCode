package ChapterSeventeen;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionToFunction {
        public static void main(String[] args) {
        Map<Integer,String> integerStringMap = new HashMap<>();
        integerStringMap.put(10,"A");
        integerStringMap.put(11,"B");
        integerStringMap.put(12,"C");
        integerStringMap.put(13,"D");
        integerStringMap.put(14,"E");
        integerStringMap.put(15,"F");

        IntFunction<String>mapToString =x->integerStringMap.getOrDefault(x,String.valueOf(x));
        System.out.println(IntStream.rangeClosed(1,15).mapToObj(mapToString).collect(Collectors.joining(" ")));
    }
}
