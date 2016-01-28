import org.junit.Test;
import prins.riana.InitializationLab2.ColorfulThing;

import static org.junit.Assert.*;

public class InitializationLab2Spec {

    @Test
    public void getColorTest() {
       ColorfulThing color1 = new ColorfulThing("red");
        assertEquals("this is the color ","red", color1.getColor());

    }
}
