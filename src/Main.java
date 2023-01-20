import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        task2(integers);
    }

    private static <T> void task1(Stream<? extends T> stream,
                                  Comparator<? super T> order,
                                  BiConsumer<? super T, ? super T> minMaxConsumer) {
        minMaxConsumer.accept(
                stream.min(order).orElse(null),
                stream.max(order).orElse(null));
    }

    private static void task2(List<Integer> list) {
        System.out.println(list.stream().filter(i -> i % 2 == 0).count());
    }
}