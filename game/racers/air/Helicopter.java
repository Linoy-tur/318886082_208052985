package game.racers.air;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
import game.racers.Racer;
import utilities.EnumContainer.Color;
import game.racers.Wheeled;

public class Helicopter extends Racer implements AerialRacer
{
    private Wheeled wheeled;

    /**
     *default Constructor of the class, the constructor initialize the Airplane
     */
    public Helicopter ()
    {
        this("Helicopter#"+getSerial(),400,50,Color.BLUE);
    }
    /**
     *Constructor of the class, the constructor initialize name and maxSpeed and acceleration and color and numOfWheels of the Airplane.
     * @param name (required).
     * @param maxSpeed (required).
     * @param acceleration (required).

     */
    public Helicopter(String name,double maxSpeed,double acceleration,Color color)
    {
        super(name,maxSpeed,acceleration,color);

    }

    /** function return string
     * @return Helicopter
     */
    @Override
    public String className()
    {
        return "Helicopter";
    }

    @Override
    /** function return string
     * @return Number Of Wheels
     */
    public String describeSpecific()
    {
        return " ";
    }

}