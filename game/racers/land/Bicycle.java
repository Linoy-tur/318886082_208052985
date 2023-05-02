package game.racers.land;

import game.racers.Racer;
import game.racers.Wheeled;
import utilities.EnumContainer.BicycleType;
import utilities.EnumContainer.Color;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
public class Bicycle<Weehled> extends Racer implements LandRacer
{
    //@SuppressWarnings("unused")
    private Wheeled wheeled;
    //	@SuppressWarnings("unused")
    private BicycleType type;

    /**
     *Constructor of the class, the constructor initialize name and maxSpeed and acceleration and color and numOfWheels of the Bicycle
     * @param name (required).
     * @param maxSpeed (required).
     * @param acceleration (required).
     * @param color (required).
     * @param numOfWheels (required).
     */
    public Bicycle(String name, double maxSpeed, double acceleration, Color color,int numOfWheels)
    {
        super(name, maxSpeed, acceleration, color);
        wheeled=new Wheeled(numOfWheels);
        setBicycleType(BicycleType.MOUNTAIN);
    }
    /**
     *default Constructor of the class, the constructor initialize the Bicycle
     */
    public Bicycle()
    {
        this("Bicycle#"+getSerial(),270,10,Color.GREEN,2);
    }

    /** function return string
     * @return Bicycle
     */
    @Override
    public String className()
    {
        return "Bicycle";
    }
    /** function return string
     * @return Bicycle Type and Number Of Wheels
     */
    @Override
    public String describeSpecific()
    {
        return ", Bicycle Type: "+getBicycleType()+", Number Of Wheels: "+this.wheeled.getNumOfWheels();
    }

    /**
     * Checking set type is a legal
     *
     * @return <tt>true</tt> if the type is a legal else return false.
     */
    public void setBicycleType(BicycleType type)
    {
        this.type=type;
    }

    /** Returns the type.  */
    public BicycleType getBicycleType() {
        return this.type;
    }

}
