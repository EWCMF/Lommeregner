import junit.framework.TestCase;

public class LommeregnerTest extends TestCase {

    public void testSum() {
        Lommeregner lommeregner1 = new Lommeregner();
        int a = 2;
        int b = 4;
        assertEquals(6, lommeregner1.sum(a, b));
    }

    public void testMinus() {
        Lommeregner lommeregner2 = new Lommeregner();
        int a = 5;
        int b = 4;
        assertEquals(1, lommeregner2.minus(a, b));
    }

    public void testMultiply() {
        Lommeregner lommeregner3 = new Lommeregner();
        int a = 5;
        int b = 7;
        assertEquals(35, lommeregner3.multiply(a, b));
    }

    public void testDivision() {
        Lommeregner lommeregner4 = new Lommeregner();
        int a = 10;
        int b = 2;
        assertEquals(5, lommeregner4.division(a, b));
    }

    public void testSecret() {
        Lommeregner lommeregner5 = new Lommeregner();
        int a = 2;
        int b = 2;
        assertEquals(0, lommeregner5.secret(a, b));
    }
}