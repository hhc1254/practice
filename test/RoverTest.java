import MarsRover.Rover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RoverTest {

    @Test
    public void RoverTest(){
        Rover rover = new Rover();

        //X: 1
        //Y: 3
        //Direction: N
        rover.setPosition(1, 2, 1);
        rover.processCommands("LMLMLMLMM");

        assertNotNull(rover);
        assertEquals(rover.getX(), 1);
        assertEquals(rover.getY(), 3);
        assertEquals(rover.getDirectionFacing(), 1);

        //X: 5
        //Y: 1
        //Direction: E
        rover.setPosition(3, 3, 2);
        rover.processCommands("MMRMMRMRRM");

        assertNotNull(rover);
        assertEquals(rover.getX(), 5);
        assertEquals(rover.getY(), 1);
        assertEquals(rover.getDirectionFacing(), 2);
    }
}
