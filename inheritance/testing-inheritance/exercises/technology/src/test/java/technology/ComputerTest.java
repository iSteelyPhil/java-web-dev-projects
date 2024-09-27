package technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {

    @Test
    public void testPowerOn() {
        Computer comp = new Computer("Dell", 512, 16);
        assertNotNull(comp);
    }
    @Test
    public void testPowerOff() {
        Computer comp = new Computer("Dell", 512, 16);
        comp.powerOff();
        // Assume powerOff would set a boolean, we could test that.
    }
    @Test
    public void testIdUniqueness(){
        Computer comp1 = new Computer("Dell", 512, 16);
        Computer comp2 = new Computer("HP", 256, 8);
        assertNotEquals(comp1.getId(), comp2.getId());
    }
}
