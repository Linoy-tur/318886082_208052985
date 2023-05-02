package game.arenas;
import java.util.ArrayList;

import game.arenas.exception.*;
import game.racers.Racer;
import utilities.Point;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
public abstract class Arena
{

    private ArrayList<Racer> activeRacers;
    private ArrayList<Racer> completedRacers;
    private final int MAX_RACERS;
    private final double FRICTION;
    private final static int MIN_Y_GAP=10;//default 10
    private double length;


    /**
     *Constructor of the class, the constructor initialize length and maxRacers of the race and setter
     * @param length (required).
     * @param maxRacers (required).
     */	public Arena(double length,int maxRacers,double friction)
    {
        this.MAX_RACERS=maxRacers;
        this.FRICTION=friction;
        this.setLength(length);
        this.setCompletedRacers(new ArrayList<>());
        this.setActiveRacers(new ArrayList<>());
    }

    /**
     * Function to add a racer, the function checks if the Racer has MaxRacers of AerialRacer,if not adds the racer.
     * @param newRacer (newRacer)
     * @throws RacerTypeException if have racer type  problem
     * @throws RacerLimitException if have racer limit  problem
     */
    public void addRacer(Racer newRacer) throws RacerLimitException, RacerTypeException
    {

        if(this.activeRacers.size()+1>getMaxRacers())
            throw new RacerLimitException(getMaxRacers(),newRacer.getSerialNumber());

        this.activeRacers.add(newRacer);

    }
    /**  Function to init Race */
    public void  initRace()
    {
        int i=0;
        for (Racer active :this.activeRacers)
        {
            active.initRace(this,new Point(0,i),new Point(this.getLength(),i));
            i+=MIN_Y_GAP;
        }
    }

    /**
     * Function to play Turn */
    public void playTurn()
    {
        for(int i=0;i<activeRacers.size();i++)
        {
            this.activeRacers.get(i).move(getFriction());
            if(this.activeRacers.get(i).getCurrentLocation().getX()>=getLength())
            {
                crossFinishLine(activeRacers.get(i));
                i--;
            }
        }
    }
    /**
     * Function to cross Finish Line 	 */
    public void crossFinishLine(Racer racer)
    {
        if (racer.getCurrentLocation().getX()>=getLength())
        {
            this.activeRacers.remove(racer);
            this.completedRacers.add(racer);
        }
    }

    /**
     * Function to show Results	 */
    public void showResults()
    {
        for(int i=0;i<this.completedRacers.size();i++ )
        {
            System.out.print("#"+i+"-> ");
            this.completedRacers.get(i).introduce();
        }
    }

    /**
     * Checking has Active Racers
     * @return <tt>true</tt> if the active not empty else return false.
     */
    public boolean hasActiveRacers()
    {
        return !(this.activeRacers.isEmpty());
    }

    /**
     * Checking set Length is a legal
     * @return <tt>true</tt> if the length is a legal else return false.
     */
    public void setLength(double length)
    {
        this.length=length;
    }
    /**
     * Checking set active Racers is a legal
     * @return <tt>true</tt> if the active Racers is a legal else return false.
     */
    public void setActiveRacers(ArrayList<Racer> activeRacers)
    {
        this.activeRacers = activeRacers;
    }

    /**
     * Checking set completed Racers is a legal
     * @return <tt>true</tt> if the completed Racers is a legal else return false.
     */
    public void setCompletedRacers(ArrayList<Racer> completedRacers)
    {
        this.completedRacers = completedRacers;
    }

    /** Returns the Weather.  */
    public ArrayList <Racer> getActiveRacers()
    {
        return this.activeRacers;
    }

    /** Returns the completedRacers.  */
    public ArrayList <Racer> getCompletedRacers()
    {
        return this.completedRacers;
    }

    /** Returns the MAX_RACERS.  */
    public int getMaxRacers()
    {
        return this.MAX_RACERS;
    }

    /** Returns the FRICTION.  */
    public double getFriction()
    {
        return this.FRICTION;
    }

    /** Returns the length.  */
    public double getLength()
    {
        return this.length;
    }
}