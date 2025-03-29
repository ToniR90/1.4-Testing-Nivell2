import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.example.Exercise6;
import org.junit.Test;

public class Exercise6Test {

    @Test
    public void throwExceptionTest(){
        Exercise6 exceptionThrow = new Exercise6();
        assertThatThrownBy(() -> exceptionThrow.throwException()).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
