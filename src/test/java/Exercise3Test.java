import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class Exercise3Test {

    @Test
    public void sameArrayTest(){
        int[] a = {1, 2 , 3};
        int[] b = {1, 2 , 3};

        assertThat(a).isEqualTo(b);
    }
}
