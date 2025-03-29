import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Exercise1Test {

    @Test
    public void sameIntegerTest(){
        Integer a = 1;
        Integer b = 1;
        Integer c = 2;

        assertThat(a).isEqualTo(b);
        assertThat(b).isNotEqualTo(c);
    }
}
