public class Product {

    private String name;
    private double value;
    private int stock;
    private boolean iva;
    public final int STOCK_MIN = 10;

    public Product() {
    }

    public Product(String name, double value, int stock, boolean iva) {
        this.name = name;
        this.value = value;
        this.stock = stock;
        this.iva = iva;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }

    public String toString() {
        return "Product [name=" + name + ", value=" + value + ", stock=" + stock + ", iva=" + iva + ", STOCK_MIN="
                + STOCK_MIN + "]";
    }

}