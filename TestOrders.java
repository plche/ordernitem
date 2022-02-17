/**
 * TestOrders
 */
public class TestOrders {

    public static void main(String[] args) {

        // Elementos del menú
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        item1.name = "moka";
        item1.price = 4.5;
        item2.name = "latte";
        item2.price = 3.5;
        item3.name = "café de goteo";
        item3.price = 1.5;
        item4.name = "capuchino";
        item4.price = 4.0;
        
        // Ordenar variables -- orden1, orden2, etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        // Simulaciones de aplicaciones
        // Utiliza este código de ejemplo para probar las actualizaciones de varios pedidos
        System.out.println("\n----- Prueba variable pedido1 -----");
        System.out.println("La variable pedido1 es: " + order1);
        
        // Predice lo que sucederá si imprimes pedido1.total
        System.out.println("\n----- Prueba pedido1.total -----");
        System.out.println("Imprimiendo pedido1.total: " + order1.total);

        // Agrega el artículo1 a la lista de artículos del pedido2 e incrementa el total del pedido
        order2.items.add(item1);
        order2.total += item1.price;
        System.out.println("\n----- Prueba +articulo1 a pedido2 y ++pedido2.total -----");
        order2.showVarsAndVals();
        
        // pedido3 pidió un capuchino. Agrega el capuchino a su lista de pedido y a su cuenta.
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.println("\n----- Prueba pedido3 +capuchino y ++pedido3.total -----");
        order3.showVarsAndVals();
        
        // pedido4 agregó un latte. Actualiza en consecuencia
        order4.items.add(item2);
        order4.total += item2.price;
        System.out.println("\n----- Prueba pedido4 +latte y ++pedido4.total -----");
        order4.showVarsAndVals();
        
        // El pedido de Cindhuri ya está listo. Actualiza su estado.
        order1.ready = true;
        System.out.println("\n----- Prueba pedido1: Cindhuri está listo -----");
        order1.showVarsAndVals();
        
        // Sam pidió más bebidas: 2 latte. Actualiza su pedido también.
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price;
        order4.total += item2.price;
        System.out.println("\n----- Prueba pedido4 +2latte y ++pedido4.total -----");
        order4.showVarsAndVals();

        // El pedido de Jimmy va está listo. Actualiza su estado.
        order2.ready = true;
        System.out.println("\n----- Prueba pedido2: Jimmy está listo -----");
        order2.showVarsAndVals();
        // System.out.println("\n");
    }
}