package game.racers.air;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
import game.racers.Racer;
import utilities.EnumContainer.Color;
import game.racers.Wheeled;

public class Airplane extends Racer implements AerialRacer
{
    private Wheeled wheeled;

    /**
     *default Constructor of the class, the constructor initialize the Airplane
     */
    public Airplane ()
    {
        this("AirPlane#"+getSerial(),885,100,Color.BLACK,3);
    }
    /**
     *Constructor of the class, the constructor initialize name and maxSpeed and acceleration and color and numOfWheels of the Airplane.
     * @param name (required).
     * @param maxSpeed (required).
     * @param acceleration (required).
     * @param numOfWheels (required).
     */
    public Airplane(String name,double maxSpeed,double acceleration,Color color,int numOfWheels)
    {
        super(name,maxSpeed,acceleration,color);
        this.wheeled=new Wheeled(numOfWheels);
    }

    /** function return string
     * @return Airplane
     */
    @Override
    public String className()
    {
        return "Airplane";
    }

    @Override
    /** function return string
     * @return Number Of Wheels
     */
    public String describeSpecific()
    {
        return ", Number Of Wheels: "+this.wheeled.getNumOfWheels();
    }

}
