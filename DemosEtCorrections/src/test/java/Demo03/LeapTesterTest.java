package Demo03;

import org.example.Demo03.LeapTester;
import org.junit.Assert;
import org.junit.Test;

public class LeapTesterTest {

    private LeapTester leapTester;

    @Test
    public void whenYear400_thenResultShouldBeTrue(){
        //Arrange
        leapTester = new LeapTester();
        //Act
        boolean res = leapTester.isLeap(400);
        //Assert
        Assert.assertTrue(res);
    }

    @Test
    public void isLeap_whenYear404_thenResultShouldBeTrue (){
        //Arrange
        leapTester = new LeapTester();
        //Act
        boolean res = leapTester.isLeap(404);
        //Assert
        Assert.assertTrue(res);
    }

    @Test
    public void isLeap_whenYear4000_thenResultShouldBeFalse (){
        //Arrange
        leapTester = new LeapTester();
        //Act
        boolean res = leapTester.isLeap(4000);
        //Assert
        Assert.assertFalse(res);
    }

    @Test
    public void isLeap_whenOthers_thenShouldBeFalse()
    {
        leapTester = new LeapTester();

        boolean res = leapTester.isLeap(1999);

        Assert.assertFalse(res);
    }

}
