package game.arenas.land;

import java.util.ArrayList;
import game.racers.land.LandRacer;
import game.arenas.Arena;
import game.arenas.exception.*;
import game.racers.Racer;
import utilities.EnumContainer.*;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
public class LandArena extends Arena
{
    private Coverage coverage;
    private Surface surface;


    /**
     *Constructor of the class, the constructor initialize length and maxRacers of the race and setter
     * @param length (required).
     * @param maxRacers (required).
     */
    public LandArena(double length,int maxRacers)
    {
        super(length,maxRacers,0.5);
        setCoverage(Coverage.GRASS);
        setSurface(Surface.FLAT);
    }
    /**
     *default Constructor of the class, the constructor initialize the LandArena
     */
    public LandArena()
    {
        this(800,8);
    }
    /**
     * Function to add a racer of type LandRacer to the arena, the function checks if the arena has LandRacer ,if so - adds the racer.
     * the function returns indication if the operation succeeded
     * @return true or false
     */
    @Override
    public void addRacer(Racer newRacer) throws RacerLimitException,RacerTypeException
    {
        if (newRacer instanceof LandRacer)
        {
            super.addRacer(newRacer);
        }
        else
            throw new RacerTypeException(newRacer.className(),"LandArena");

    }

    /** Returns the Coverage.  */
    public Coverage getCoverage()
    {
        return this.coverage;
    }
    /** Returns the surface.  */

    public Surface getSurface()
    {
        return this.surface;
    }

    /**
     * Checking set coverage is a legal
     * @param coverage (required) brand new Coverage coverage.
     * @return <tt>true</tt> if the coverage is a legal else return false.
     */
    public void setCoverage(Coverage coverage)
    {
        this.coverage = coverage;
    }
    /**
     * Checking set Surface is a legal
     * @return <tt>true</tt> if the surface is a legal else return false.
     */
    public void setSurface(Surface surface)
    {
        this.surface = surface;
    }
}