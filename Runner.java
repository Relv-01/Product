public class Runner {
    public static void main(String[] args) {
        Product product = new Product("Ron", 15.000, 10, true, ETypeProduct.LICORES);
        Sale sale = new Sale(0, product);
        Presenter presenter = new Presenter();
        System.out.println(presenter.addSale(sale));
    }
}