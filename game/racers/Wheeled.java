package game.racers;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
public class Wheeled
{

    private int numOfWheels;

    /**
     *default Constructor of the class, the constructor initialize the Wheeled
     */
    public Wheeled()
    {
        this(3);
    }
    /**
     *Constructor of the class, the constructor initialize numOfWheels.
     * @param numOfWheels (required).
     */
    public Wheeled(int numOfWheels)
    {
        this.setNumOfWheels(numOfWheels);
    }

    /** Returns the numOfWheels.  */
    public int getNumOfWheels()
    {
        return this.numOfWheels;
    }
    /**
     * Checking set numOfWheels is a legal
     * @return <tt>true</tt> if the numOfWheels is a legal else return false.
     */
    public void setNumOfWheels(int numOfWheels)
    {
        this.numOfWheels = numOfWheels;
    }

}