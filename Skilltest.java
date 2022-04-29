import org.junit.*;
import static org.junit.Assert.*;

public class Skilltest {
    


    @Test
    public void testInt(){
        int a = 1000;
        int b = 100;
        int c = 0;

        assertEquals(1, Skill.greaterthan100(a));
        assertEquals(0, Skill.greaterthan100(b));
        assertEquals(0, Skill.greaterthan100(c));


    }
}
