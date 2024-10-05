package StreamApiPgms;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

//Capgemny interview questions
public class FilterExample {
    public static void main(String[] args) throws ClassNotFoundException {




        List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99")));


        //QUESTION-1
        /*
        {
            19.99=[
                    Item{name='banana', qty=20, price=19.99},
                    Item{name='banana', qty=10, price=19.99}
                ],
            29.99=[
                    Item{name='orang', qty=10, price=29.99},
                    Item{name='watermelon', qty=10, price=29.99}
                ],
            9.99=[
                    Item{name='apple', qty=10, price=9.99},
                    Item{name='papaya', qty=20, price=9.99},
                    Item{name='apple', qty=10, price=9.99},
                    Item{name='apple', qty=20, price=9.99}
                ]
        }
         */

        Map<BigDecimal,List<Item>> itemListByPrice
                = items.stream().collect(Collectors.groupingBy(Item::getPrice, Collectors.toList()));


        for (Map.Entry<BigDecimal, List<Item>> entry : itemListByPrice.entrySet()) {
            List<Item> items1 = entry.getValue();
            System.out.println("PRICE - " + entry.getKey());
            items1.stream().forEach(item -> {
                System.out.println(item.getFruit() + " - " + item.getQuantity());
            });
            System.out.println("\n");
        }

        //QUESTION-2
        /*
            {
            19.99=[banana],
            29.99=[orang, watermelon],
            9.99=[papaya, apple]
}
         */
        items.stream().collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getFruit, Collectors.toSet())));


        Map<BigDecimal, Set<String>> itemByName
                = items.stream().collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getFruit, Collectors.toSet())));


        items.stream().collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getFruit, Collectors.toSet())));
        for (Map.Entry<BigDecimal, Set<String>> entry : itemByName.entrySet()) {

        }



    }
}


class Item {
    String fruit;
    Integer quantity;
    BigDecimal price;

    public Item(String fruit, Integer quantity, BigDecimal price) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.price = price;
    }

    public String getFruit() {
        return fruit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(fruit, item.fruit) && Objects.equals(quantity, item.quantity) && Objects.equals(price, item.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruit, quantity, price);
    }
}
