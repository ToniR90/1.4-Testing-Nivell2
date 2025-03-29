import static org.assertj.core.api.Assertions.assertThat;

import org.example.Exercise4;
import org.junit.jupiter.api.Test;


public class Exercise4Test {

    @Test
    public void objectsOrderTest(){
        Exercise4 objectList = new Exercise4();
        objectList.addObject("Baloon");
        objectList.addObject(1990);
        objectList.addObject(2004);

        assertThat(objectList.getObjects()).containsExactly("Baloon" , 1990 , 2004);
    }

    @Test
    public void anyOrderTest(){
        Exercise4 objectList = new Exercise4();
        objectList.addObject("Frodo");
        objectList.addObject("Sam");
        objectList.addObject("Pippin");

        assertThat(objectList.getObjects()).contains("Pippin" , "Frodo" , "Sam");
    }

    @Test
    public void onlyOneObject(){
        Exercise4 objectList = new Exercise4();
        objectList.addObject("Orc");
        objectList.addObject("Goblin");

        assertThat(objectList.getObjects()).containsOnlyOnce("Orc");
    }

    @Test
    public void doesNotContains(){
        Exercise4 objectList = new Exercise4();
        objectList.addObject("Ring");

        assertThat(objectList.getObjects()).doesNotContain("Ship");
    }
}
