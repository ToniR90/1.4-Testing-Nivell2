import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;

public class Exercise2Test {

    @Test
    public void sameObjectTest(){
        Object object1 = new Object();
        Object object2 = object1;
        Object object3 = new Object();

        assertThat(object1.equals(object2));
        assertThat(object1).isNotEqualTo(object3);

    }
}
