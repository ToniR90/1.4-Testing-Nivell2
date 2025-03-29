import static org.assertj.core.api.Assertions.assertThat;

import org.example.Exercise7;
import org.junit.jupiter.api.Test;

public class Exercise7Test {

    @Test
    public void optionalIsEmptyTest(){
        Exercise7 optional = new Exercise7();

        assertThat(optional.getOptional()).isEmpty();
    }
}
