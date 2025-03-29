import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Exercise5Test {

    @Test
    public void containsKeyTest(){
        Map<String , String> newMap = new HashMap<>();
        newMap.put("Key" , "Value");

        assertThat(newMap.containsKey("Key"));
    }
}
