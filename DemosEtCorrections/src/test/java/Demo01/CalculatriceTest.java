package Demo01;

import org.example.Demo01.Calculatrice;
import org.example.Demo01.DivideByZeroException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatriceTest {
    private Calculatrice cal;

    @Test
    public void WhenAddition_1_1_Then_2 (){
        // Arrange
//        Calculatrice cal = new Calculatrice();
        cal = new Calculatrice();
        double varX = 1;
        double varY = 1;

        // Act
        double result = cal.addition(varX, varY);

        //Assert
        Assert.assertEquals(2, result, 0.0001);
    }


    @Test
    public void WhenDivision_30_10_Then_3(){
        //Arrange
        cal = new Calculatrice();
        double x = 30;
        double y = 10;

        //Act
        double result = cal.division(x,y);

        //Assert
        Assert.assertEquals(3,result,0.01);
    }

    @Test
    public void WhenDivision_10_0_Then_DivideByZeroException (){
        //Arrange
        cal = new Calculatrice();
        double x = 10;
        double y = 0;

        //Act Arrange
        Assert.assertThrows(DivideByZeroException.class,()->{cal.division(x,y);});
    }

}
