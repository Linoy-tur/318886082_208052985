package game.racers.land;

import game.racers.Racer;
import game.racers.Wheeled;
import utilities.EnumContainer.Engine;
import utilities.EnumContainer.Color;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
public class Car extends Racer implements LandRacer
{
    //@SuppressWarnings("unused")
    private Wheeled wheeled;
    private Engine engine;

    /**
     *Constructor of the class, the constructor initialize name and maxSpeed and acceleration and color and numOfWheels of the Car
     * @param name (required).
     * @param maxSpeed (required).
     * @param acceleration (required).
     * @param color (required).
     * @param numOfWheels (required).
     */
    public Car(String name,double maxSpeed, double acceleration, Color color,int numOfWheels)
    {
        super(name, maxSpeed, acceleration, color);
        wheeled=new Wheeled(numOfWheels);
        setEngine(Engine.FORURSTROKE);
    }
    /**
     *default Constructor of the class, the constructor initialize the Car
     */
    public Car()
    {
        this("Car#"+getSerial(),400,20,Color.RED,4);
    }

    /** Returns the Car  */

    @Override
    public String className()
    {
        return "Car";
    }
    /** Returns the Engine Type and Number Of Wheels and NumOfWheels.  */

    @Override
    public String describeSpecific()
    {
        return ", Engine Type: "+getEngine()+", Number Of Wheels: "+this.wheeled.getNumOfWheels();
    }

    /**
     * Checking set Engine is a legal

     * @return <tt>true</tt> if the Engine is a legal else return false.
     */
    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }
    /** Returns the engine.  */
    public Engine getEngine() {
        return engine;
    }

}