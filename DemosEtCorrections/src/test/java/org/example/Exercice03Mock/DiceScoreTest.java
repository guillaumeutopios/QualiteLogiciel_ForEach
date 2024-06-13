package org.example.Exercice03Mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DiceScoreTest {
    private DiceScore diceScore;

    private final IDe de = Mockito.mock(IDe.class);

    @Test
    public void when2DiceAreSame_DeValue5_ThenScore_20 (){
        //Arrange
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(5);

        //Act
        int result = diceScore.getScore();

        //Assert
        Assertions.assertEquals(20,result);
    }

    @Test
    public void when2DiceAreSame_DeValue6_ThenScore_30(){
        //Arrange
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(6);

        //Act
        int result = diceScore.getScore();

        //Assert
        Assertions.assertEquals(30,result);
    }

    @Test
    public void whenDice1Value_5_Dice2Value_6_ThenScore_6 (){
        //Arrange
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(5,6);
//        Mockito.when(de.getRoll()).thenReturn(5).thenReturn(6);

        //Act
        int result = diceScore.getScore();

        //Assert
        Assertions.assertEquals(6,result);
    }

    @Test
    public void whenDice1Value_5_Dice2Value_4_ThenScore_5 (){
        //Arrange
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(5,4);

        //Act
        int result = diceScore.getScore();

        //Assert
        Assertions.assertEquals(5,result);
    }
}
