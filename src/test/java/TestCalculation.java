import org.junit.Assert;
import org.junit.Test;

public class TestCalculation {
    @Test
    public void testSum() {
        Calculation calc=new Calculation();

        //Assert.assertEquals(5.00,calc.Sum(2,3));
        Assert.assertTrue(5==calc.Sum(2,3));
    }
}
