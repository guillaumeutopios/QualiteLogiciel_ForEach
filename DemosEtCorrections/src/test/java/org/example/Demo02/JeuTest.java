package org.example.Demo02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class JeuTest {

    private Jeu jeu;
    private IDe de = Mockito.mock(IDe.class);

    @Test
    public void WhenDeLancerWithValue20_ThenJeuReturnTrue(){
        jeu = new Jeu(de);
        Mockito.when(de.lancer()).thenReturn(20);

        boolean result = jeu.jouer();

        Assertions.assertTrue(result);
    }

    @Test
    public void WhenDeLancerWithValue19_ThenJeuReturnFalse (){
        //Arrange
        jeu = new Jeu(de);
        Mockito.when(de.lancer()).thenReturn(19);

        //Act
        boolean result = jeu.jouer();

        //Assert
        Assertions.assertFalse(result);
    }

}
