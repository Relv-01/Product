import org.junit.jupiter.api.Test;

public class SaleTest {
    @Test
    void testCalcDiscount() {

    }

    @Test
    void testCalcIva() {
        Product product = new Product("Ron", 17.000, 1, true, ETypeProduct.LICORES);
        assertEquals(3.23, product, 0.001);
    }

    private void assertEquals(double d, Product product, double e) {
    }

    @Test
    void testGetTotalSale() {

    }
}
