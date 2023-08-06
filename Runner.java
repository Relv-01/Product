public class Runner {
    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        System.out.println(presenter.addSale("Ron", 15000, 10, true, ETypeProduct.LICORES));
        System.out.println(presenter.showSale());

        System.out.println(presenter.addSale("Car", 5000000, 2, true, ETypeProduct.RANCHO));
        System.out.println(presenter.showSale());
    }
}