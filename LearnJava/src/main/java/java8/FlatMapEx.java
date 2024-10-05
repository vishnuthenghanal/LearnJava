package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Order {
    private int orderId;
    private List<String> items;

    public Order(int orderId, List<String> items) {
        this.orderId = orderId;
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }
}

public class FlatMapEx {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(1, Arrays.asList("Apple", "Banana", "Orange")),
                new Order(2, Arrays.asList("Banana", "Grapes")),
                new Order(3, Arrays.asList("Orange", "Apple"))
        );

        List<String> distinctItems = orders.stream().flatMap(order -> order.getItems().stream()).distinct().collect(Collectors.toList());

        System.out.println("Distinct items: " + distinctItems);
    }
}
