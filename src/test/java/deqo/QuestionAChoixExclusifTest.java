package deqo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QuestionAChoixExclusifTest {

    QuestionAChoixExclusif q = new QuestionAChoixExclusif("enonce",2);
    @Test
    public void getEnonceTest(){
        String enonce = "enonce";
        assertEquals("Erreur : mauvais enonce","enonce",q.getEnonce());
    }

    @Test
    public void getScoreForIndiceTest(){
        int indiceChoix = 2;
        assertEquals("Erreur : mauvais indice",100, q.getScoreForIndice(indiceChoix), 0.1);
    }

    @Test
    public void getScoreForIndiceMauvTest(){
        int indiceChoix = 3;
        assertEquals("Erreur : mauvais indice",0, q.getScoreForIndice(indiceChoix), 0.1);
    }

}
