import entities.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Product> list = new ArrayList<>();

    list.add(new Product("TV",900.00));
    list.add(new Product("Smatphone",1500.00));
    list.add(new Product("Tablet",1200.00));
    list.add(new Product("Notebook", 3000.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Monitor", 500.00));
    list.add(new Product("Headset", 76.00));
    
    list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); // Apply a 10% increase to all products
    list.forEach(System.out::println); // Print all products
}
