package org.example.Exercice02;

//import org.junit.Before; // junit 4
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibTest {

    private Fib fib;

    @BeforeEach
    public void setup (){
        fib = new Fib();
    }

    //Lors du déclanchement de la fonction GetFibSeries() avec un Range de 1
    //Le résultat n’est pas vide
    @Test
    public void whenGetFibSeries_Range1_ThenResultIsNotEmpty(){
//        Fib fib = new Fib();

        //Act
        List<Integer> result = fib.getFibSeries(1);

        //Assert
//        Assertions.assertNotEquals(0,result.size());
        Assertions.assertFalse(result.isEmpty());

    }


    //Le résultat correspond à une liste qui contient {0}
    @Test
    public void whenGetFibSeries_IfRange1_ThenResultContain_0(){
        //Act
        List<Integer> result = fib.getFibSeries(1);

        //Assert
        Assertions.assertTrue(result.contains(0));
    }
    //Lors du déclanchement de la fonction GetFibSeries() avec un Range de 6
    //Le résultat contient le chiffre 3
    @Test
    public void whengetFibSeries_IfRange6_ThenResultContain_3(){
        //Act
        List<Integer> result = fib.getFibSeries(6);

        //Assert
        Assertions.assertTrue(result.contains(3));
    }

    //Le résultat contient 6 éléments
    @Test
    public void whenGetFibSeries_IfRange6_ThenResultContain_6_Elements (){
        //Act
        List<Integer> result = fib.getFibSeries(6);

        //Assert
        Assertions.assertEquals(6,result.size());
    }
    //Le résultat n’a pas le chiffre 4 en son sein
    @Test
    public void whenGetFibSeries_IfRange6_ThenResultDoesNotContain_4 (){
        //Act
        List<Integer> result = fib.getFibSeries(6);

        //Assert
        Assertions.assertFalse(result.contains(4));
    }
    //Le résultat correspond à une liste qui contient {0, 1, 1, 2, 3, 5}
    @Test
    public void whenGetFibSeries_IfRange6_ThenResultContain_0_1_1_2_3_5 (){
        //Arrange
        List<Integer> expected = Arrays.asList(new Integer[]{0,1,1,2,3,5});

        //Act
        List<Integer> result = fib.getFibSeries(6);

        //Assert
        Assertions.assertTrue(result.containsAll(expected));
    }
    //Le résultat est trié de façon ascendance
    @Test
    public void whenGetFibSeries_IfRange6_ThenResultIsSortedAscending (){
        //Act
        List<Integer> result = fib.getFibSeries(6);
//        List<Integer> expected = new ArrayList<>(result);
//        Collections.sort(expected);
        List<Integer> expected = result.stream().sorted().toList();

        //Assert
        Assertions.assertArrayEquals(expected.toArray(),result.toArray());
    }
}