package org.example.Exercice04;

import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RechercheVilleTest {

    private RechercheVille rechercheVille;

    private List<String> villes = Arrays.asList(new String[] {"Paris","Budapest","Skopje","Valence","Vancouver","Amsterdam","Sydney","Londres"});

    @BeforeEach
    public void setUp (){
        rechercheVille = new RechercheVille(villes);
    }

    @Test
    public void rechercheWhenLess_2_Char_Raise_NotFoundException(){
        //Arrange
        String myChar = "v";

        //Act Assert
        Assertions.assertThrows(NotFoundException.class,()->{
            rechercheVille.recherche(myChar);
        });
    }

    @Test
    public void rechercheWhenGt_2_Char_ThenReturn_CitiesStartedWithChar () throws ExecutionControl.NotImplementedException {
        //Arrange
        String mySearch = "Va";
        String[] expected = new String[] {"Valence","Vancouver"};

        //Act
        List<String> result = rechercheVille.recherche(mySearch);

        //Assert
        Assertions.assertArrayEquals(expected,result.toArray());
    }

    @Test
    public void rechercheWhenGt_2_Char_NoCaseSensitive () throws ExecutionControl.NotImplementedException {
        //Arrange
        String mySearch = "vA";
        String[] expected = new String[] {"Valence","Vancouver"};

        //Act
        List<String> result = rechercheVille.recherche(mySearch);

        //Assert
        Assertions.assertArrayEquals(expected,result.toArray());
    }

    @Test
    public void rechercheWhenGt_2_Char_ThenReturnCitiesContainChar () throws ExecutionControl.NotImplementedException {
        //Arrance
        String mySearch = "ape";
        String[] expected = new String[]{"Budapest"};

        //Act
        List<String> result = rechercheVille.recherche(mySearch);

        //Assert
        Assertions.assertArrayEquals(expected,result.toArray());
    }

    @Test
    public void rechercheWhenChar_Asterisk_ThenReturnAllCities () throws ExecutionControl.NotImplementedException {
        //Arrange
        String mySearch = "*";

        //Act
        List<String> result = rechercheVille.recherche(mySearch);

        Assertions.assertArrayEquals(villes.toArray(),result.toArray());
    }

}
