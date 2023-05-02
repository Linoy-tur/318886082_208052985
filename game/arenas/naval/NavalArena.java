package game.arenas.naval;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
import game.arenas.Arena;
import game.arenas.exception.RacerLimitException;
import game.arenas.exception.RacerTypeException;
import game.racers.Racer;
import game.racers.naval.NavalRacer;
import utilities.EnumContainer.Body;
import utilities.EnumContainer.Surface;
import utilities.EnumContainer.Water;

public class NavalArena extends Arena
{

    private Water water;
    private Surface surface;
    private Body body;


    /**
     *Constructor of the class, the constructor initialize length and maxRacers of the race and setter
     * @param length (required).
     * @param maxRacers (required).
     */
    public NavalArena(double length, int maxRacers)
    {
        super(length, maxRacers, 0.7);
        this.setWater(Water.SWEET);
        this.setSurface(Surface.FLAT);
        this.SetBody(Body.LAKE);
    }
    /**
     *default Constructor of the class, the constructor initialize the NavalArena
     */
    public NavalArena()
    {
        this(1000,5);
    }

    /**
     * Function to add a racer to the arena, the function checks if the Racer has instance of NavalRacer,if so adds the racer.
     * @param newRacer (newRacer)
     * @throws RacerLimitException if have Racer Limit problem
     * @throws RacerTypeException if have Racer Type  problem
     */
    @Override
    public void addRacer(Racer newRacer) throws RacerLimitException,RacerTypeException
    {
        if (newRacer instanceof Racer)
        {
            super.addRacer(newRacer);
        }
        else
            throw new RacerTypeException(newRacer.className(),"NavalArena");
    }

    /**
     * Checking set Body is a legal
     * @return <tt>true</tt> if the Body is a legal else return false.
     */
    private void SetBody(Body body)
    {
        this.body=body;

    }
    /**
     * Checking set Surface is a legal
     * @return <tt>true</tt> if the Surface is a legal else return false.
     */
    private void setSurface(Surface surface)
    {
        this.surface=surface;
    }
    /**
     * Checking set Water is a legal
     * @return <tt>true</tt> if the Water is a legal else return false.
     */
    private void setWater(Water water)
    {
        this.water=water;
    }
    /** Returns the water.  */
    public Water getWater()
    {
        return this.water;
    }
    /** Returns the surface.  */
    public Surface getSurface()
    {
        return this.surface;
    }
    /** Returns the body.  */
    public Body getBody()
    {
        return this.body;
    }
}