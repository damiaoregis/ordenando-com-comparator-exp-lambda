import entities.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Product> list = new ArrayList<>();

    list.add(new Product("TV",900.00));
    list.add(new Product("Smatphone",1500.00));
    list.add(new Product("Tablet",1200.00));
    list.add(new Product("Notebook", 3000.00));

    list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
    for (Product p : list) {
       IO.println(p);
    }
}
