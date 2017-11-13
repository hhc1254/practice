package MarsRover;

public class Rover {

    //Directions
    public static final int North = 1;
    public static final int East = 2;
    public static final int South = 3;
    public static final int West = 4;

    //Starting Positions
    int x = 0;
    int y = 0;

    //Starting Direction
    int directionFacing = North;

    /**
     * Constructor
     */
    public Rover() {

    }

    /**
     * Sets the position of the Rover
     * @params x x-axis coordinate
     * @params y y-axis coordinate
     * @params directionFacing direction the rover is facing
     */
    public void setPosition(int x, int y, int directionFacing) {
        this.x = x;
        this.y = y;
        this.directionFacing = directionFacing;
    }

    /**
     * Returns x coordinate
     */
    public int getX(){
        return x;
    }

    /**
     * Returns y coordinate
     */
    public int getY(){
        return y;
    }

    /**
     * Returns direction facing
     */
    public int getDirectionFacing(){
        return directionFacing;
    }

    /**
     * Gets the position of the Rover
     * @return x, y coordinate and direction facing
     */
    public String getPosition() {
        char direction;

        switch(directionFacing){
            case 1:
                direction = 'N';
                break;
            case 2:
                direction = 'E';
                break;
            case 3:
                direction = 'S';
                break;
            case 4:
                direction = 'W';
                break;
            default:
                direction = 'N';
                break;
        }
        return "X: " + x + "\n" + "Y: " + y + "\n" + "Direction: " + direction + "\n";
    }

    /**
     * Process turn and move commands
     * @params commands turn and move commands
     */
    public void processCommands(String commands) {
        for (int i = 0; i < commands.length(); i++) {
            moveRover(commands.charAt(i));
        }
    }

    /**
     * Process turn and move commands by each character
     * @params command turn or move command
     */
    public void moveRover(Character command) {
        switch(command){
            case 'L':
                turnLeft();
                break;
            case 'R':
                turnRight();
                break;
            case 'M':
                move();
                break;
            default:
                throw new IllegalArgumentException("Invalid Inputs");
        }
    }

    /**
     * Move the rover in specified direction
     */
    private void move() {
        switch(directionFacing){
            case North:
                this.y++;
                break;
            case East:
                this.x++;
                break;
            case South:
                this.y--;
                break;
            case West:
                this.x--;
                break;
        }
    }

    /**
     * Turn the rover left
     */
    private void turnLeft() {
        directionFacing = (directionFacing - 1) < North ? West : directionFacing - 1;
    }

    /**
     * Turn the rover right
     */
    private void turnRight() {
        directionFacing = (directionFacing + 1) > West ? North : directionFacing + 1;
    }

    public static void main(String args[]) {
        Rover rover = new Rover();

        //X: 1
        //Y: 3
        //Direction: N
        rover.setPosition(1, 2, North);
        rover.processCommands("LMLMLMLMM");
        System.out.println(rover.getPosition());

        //X: 5
        //Y: 1
        //Direction: E
        rover.setPosition(3, 3, East);
        rover.processCommands("MMRMMRMRRM");
        System.out.println(rover.getPosition());
    }
}
