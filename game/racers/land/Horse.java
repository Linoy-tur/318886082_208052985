package game.racers.land;

import game.racers.Racer;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.Breed;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
public class Horse extends Racer implements LandRacer
{
    //@SuppressWarnings("unused")
    private Breed breed;

    /**
     *Constructor of the class, the constructor initialize name and maxSpeed and acceleration and color of the Horse
     * @param name (required).
     * @param maxSpeed (required).
     * @param acceleration (required).
     * @param color (required).
     */
    public Horse(String name, double maxSpeed, double acceleration, Color color)
    {
        super(name, maxSpeed, acceleration, color);
        setBreed(Breed.THOROUGHBRED);
    }
    /**
     *default Constructor of the class, the constructor initialize the Horse
     */
    public Horse()
    {
        this("Horse#"+getSerial(),50,3,Color.BLACK);
    }


    /** Returns the Horse.  */
    @Override
    public String className()
    {
        return "Horse";
    }
    /** Returns the Breed and getBreed.  */
    @Override
    public String describeSpecific()
    {
        return ", Breed: "+getBreed();
    }

    /**
     * Checking set  Breed is a legal

     * @return <tt>true</tt> if the Breed is a legal else return false.
     */
    private void setBreed(Breed breed)
    {
        this.breed=breed;
    }

    /** Returns the Breed.  */
    private Breed getBreed()
    {
        return this.breed;
    }

}
