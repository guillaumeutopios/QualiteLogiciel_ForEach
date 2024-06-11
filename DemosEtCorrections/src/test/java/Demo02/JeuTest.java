package Demo02;

import org.example.Demo02.De;
import org.example.Demo02.IDe;
import org.example.Demo02.Jeu;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class JeuTest {

    private Jeu jeu;
    private IDe de = Mockito.mock(IDe.class);

    @Test
    public void WhenDeLancerWithValue20_ThenJeuReturnTrue(){
        jeu = new Jeu(de);
        Mockito.when(de.lancer()).thenReturn(20);

        boolean result = jeu.jouer();

        Assert.assertTrue(result);
    }

    @Test
    public void WhenDeLancerWithValue19_ThenJeuReturnFalse (){
        //Arrange
        jeu = new Jeu(de);
        Mockito.when(de.lancer()).thenReturn(19);

        //Act
        boolean result = jeu.jouer();

        //Assert
        Assert.assertFalse(result);
    }

}
