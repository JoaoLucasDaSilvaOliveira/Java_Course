package N52;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class App {
    public static void main(String[] args) {
        List<Product> produtos = new ArrayList<>(List.of(
           new Product("Celular", Category.ELETRONIC, 1500.00),
           new Product("Boneca", Category.TOY, 50.00),
           new Product("Sofá", Category.STATIONARY, 3000.00)
        ));
        List<Product> produtos2 = new ArrayList<>(List.of(
                new Product("Celular", Category.ELETRONIC, 1500.00),
                new Product("Boneca", Category.TOY, 50.00),
                new Product("Sofá", Category.STATIONARY, 400.00)
        ));
        List<Order> pedidos = new ArrayList<>(List.of(
        new Order(0L, new Costumer("João"), produtos, LocalDate.of(2025,8,15)),
        new Order(1L, new Costumer("João"), produtos2, LocalDate.of(2025,8,15))
        ));
        System.out.println(pedidosDeCadaCliente(pedidos));
        System.out.println(custoDeCadaPedido(pedidos));
        System.out.println(pessoasQueCompraramBrinquedos(pedidos));
        System.out.println(queryD(pedidos));
    }
    record Product (String name, Category category, double price){}
    record Order (Long id, Costumer costumer, List<Product> productList, LocalDate orderDate){}
    record Costumer (String name){}
    enum Category {
        TOY,
        ELETRONIC,
        STATIONARY
    }

    public static Map<String, Long> pedidosDeCadaCliente (List<Order> pedidos){
        return pedidos.stream().map(Order::costumer).collect(Collectors.groupingBy(Costumer::name, Collectors.counting()));
    }

    public static Map<Long, Double> custoDeCadaPedido (List<Order> pedidos){
        return pedidos.stream().collect(Collectors.groupingBy(Order::id, Collectors.summingDouble(o -> o.productList().stream().mapToDouble(Product::price).sum())));
    }

    public static String pessoasQueCompraramBrinquedos (List<Order> pedidos){
        return pedidos.stream().filter(pedido -> pedido.productList.stream().anyMatch(produto -> produto.category == Category.TOY)).map(order -> order.costumer.name()).collect(Collectors.joining(", "));
    }

    public static List<Long> queryD (List<Order> pedidos){
        return pedidos.stream().collect(Collectors.groupingBy(
                Order::id,
                Collectors.summingDouble(order -> order.productList.stream().mapToDouble(Product::price).sum())
        )).entrySet().stream().filter(e-> e.getValue() > 500).map(Map.Entry::getKey).toList();
    }
}
