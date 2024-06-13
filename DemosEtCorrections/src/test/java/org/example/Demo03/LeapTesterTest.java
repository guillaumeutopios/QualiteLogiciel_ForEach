package org.example.Demo03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LeapTesterTest {

    private LeapTester leapTester;

    @Test
    public void whenYear400_thenResultShouldBeTrue(){
        //Arrange
        leapTester = new LeapTester();
        //Act
        boolean res = leapTester.isLeap(400);
        //Assert
        Assertions.assertTrue(res);
    }

    @Test
    public void isLeap_whenYear404_thenResultShouldBeTrue (){
        //Arrange
        leapTester = new LeapTester();
        //Act
        boolean res = leapTester.isLeap(404);
        //Assert
        Assertions.assertTrue(res);
    }

    @Test
    public void isLeap_whenYear4000_thenResultShouldBeFalse (){
        //Arrange
        leapTester = new LeapTester();
        //Act
        boolean res = leapTester.isLeap(4000);
        //Assert
        Assertions.assertFalse(res);
    }

    @Test
    public void isLeap_whenOthers_thenShouldBeFalse()
    {
        leapTester = new LeapTester();

        boolean res = leapTester.isLeap(1999);

        Assertions.assertFalse(res);
    }

}
