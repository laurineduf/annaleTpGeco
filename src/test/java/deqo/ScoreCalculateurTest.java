package deqo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ScoreCalculateurTest {

    QuestionAChoixMultiple qcm =
            new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));

    ScoreCalculateur sc = new ScoreCalculateur();

    @Test
    public void calculeScoreTest(){
        Integer[] valeur  = {1,4};
        List<Integer> indicesBonnesReponses= Arrays.asList(valeur);

        assertEquals("Erreur: on obtient pas 0",0,sc.calculeScore(indicesBonnesReponses,qcm),0.1);
    }

    @Test
    public void calculeScore2Test(){
        Integer[] valeur  = {2,3};
        List<Integer> indicesBonnesReponses= Arrays.asList(valeur);

        assertEquals("Erreur: on obtient pas le bon resultat",(float) 66.66,sc.calculeScore(indicesBonnesReponses,qcm),0.01);
    }

    @Test
    public void calculeScore3Test(){
        Integer[] valeur  = {2,3,5};
        List<Integer> indicesBonnesReponses= Arrays.asList(valeur);

        assertEquals("Erreur: on obtient pas le bon resultat",(float) 100,sc.calculeScore(indicesBonnesReponses,qcm),0.01);
    }
}
