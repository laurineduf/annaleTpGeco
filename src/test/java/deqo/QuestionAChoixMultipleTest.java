package deqo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class QuestionAChoixMultipleTest {
    Integer[] valeur  = {1,2,3,4,5,6};
    List<Integer> indicesBonnesReponses= Arrays.asList(valeur);
    QuestionAChoixMultiple q = new QuestionAChoixMultiple("enonce",indicesBonnesReponses);

    @Test
    public void getEnonceTest(){
        String enonce = "enonce";
        assertEquals("Erreur : mauvais enonce","enonce",q.getEnonce());
    }

    @Test
    public void getScoreForIndiceTest(){
        int indiceChoix = 2;
        assertEquals("Erreur : mauvais indice",(float) 16.66, q.getScoreForIndice(indiceChoix), 0.1);
    }

    @Test
    public void getScoreForIndice2Test(){
        int indiceChoix = 20;
        assertEquals("Erreur : mauvais indice",0, q.getScoreForIndice(indiceChoix), 0.1);
    }


}
