package org.example.Exercice03Mock;

public class DiceScore {
    private IDe de;

    public DiceScore(IDe de) {
        this.de = de;
    }

    public int getScore (){
        int scoreFirst = de.getRoll();
        int scoreSecond = de.getRoll();

        if(scoreFirst == scoreSecond){
            if(scoreFirst == 6){
                return 30;
            }
            return scoreFirst*2 + 10;
        }else{
            return Math.max(scoreFirst, scoreSecond);
        }
    }
}
