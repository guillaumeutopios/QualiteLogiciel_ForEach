import org.example.Demo01.Calculatrice;
import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    @Test
    public void testA(){
        Calculatrice cal = new Calculatrice();
        double varX = 1;
        double varY = 1;

        double result = cal.addition(varX, varY);

        Assert.assertEquals(2, result, 0.0001);
    }
}
