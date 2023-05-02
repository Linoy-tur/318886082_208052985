package game.arenas.air;

import game.arenas.Arena;
import game.arenas.exception.*;
import game.racers.Racer;
import game.racers.air.AerialRacer;
import utilities.EnumContainer.*;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */

public class AerialArena extends Arena
{

    private Wind wind;
    private Vision vision;
    private Weather weather;
    private Height height;



    /**
     *Constructor of the class
     * @param length (required).
     * @param maxRacers (required).
     */
    public AerialArena(double length,int maxRacers)
    {
        super(length,maxRacers,0.4);
        this.setVision(Vision.SUNNY);
        this.setWeather(Weather.DRY);
        this.setHeight(Height.HIGH);
        this.setWind(Wind.HIGH);
    }

    /**
     *default Constructor of the class, the constructor initialize the lists of players
     */
    public AerialArena()
    {
        this(1500,6);
    }



    @Override
    /**
     * Function to add a racer to the arena, the function checks if the Racer has instance of AerialRacer,if so adds the racer.
     * @param newRacer (newRacer)
     * @throws RacerLimitException if have Racer Limit problem
     * @throws RacerTypeException if have Racer Type  problem
     */

    public void addRacer(Racer newRacer) throws RacerLimitException,RacerTypeException
    {
        if (newRacer instanceof AerialRacer)
        {
            super.addRacer(newRacer);
        }
        else
            throw new RacerTypeException(newRacer.className(),"AerialArena");

    }

    /**
     * Checking set Height is a legal
     * @param height (required) brand new Height height.
     * @return <tt>true</tt> if the height is a legal else return false.
     */

    public void setHeight(Height height)
    {
        this.height=height;
    }

    /**
     * Checking set Wind is a legal
     * @param wind (required) brand new Wind wind.
     * @return <tt>true</tt> if the Wind is a legal else return false.
     */
    public void setWind(Wind wind)
    {
        this.wind=wind;
    }

    /**
     * Checking set vision is a legal
     * @param vision (required) brand new Vision vision.
     * @return <tt>true</tt> if the Vision is a legal else return false.
     */

    public void setVision(Vision vision)
    {
        this.vision=vision;
    }

    /**
     * Checking set vision is a legal
     * @param
     * @return <tt>true</tt> if the Vision is a legal else return false.
     */
    public void setWeather(Weather weather)
    {
        this.weather=weather;
    }

    /** Returns the Weather.  */
    public Weather getWeather()
    {
        return this.weather;
    }
    /** Returns the Vision.  */
    public Vision getVision()
    {
        return this.vision;
    }

    /** Returns the Wind.  */
    public Wind getWind()
    {
        return this.wind;
    }
    /** Returns the Height.  */
    public Height getHeight()
    {
        return this.height;
    }

}