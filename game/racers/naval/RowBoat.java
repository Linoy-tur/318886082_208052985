package game.racers.naval;

import game.racers.Racer;
import game.racers.land.LandRacer;
import utilities.EnumContainer.BoatType;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.Team;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
public class RowBoat extends Racer implements LandRacer {

    //@SuppressWarnings("unused")
    private BoatType type;
    //@SuppressWarnings("unused")
    private Team team;


    /**
     *Constructor of the class, the constructor initialize name and maxSpeed and acceleration and color of the RowBoat
     * @param name (required).
     * @param maxSpeed (required).
     * @param acceleration (required).
     * @param color (required).
     */
    public RowBoat(String name, double maxSpeed, double acceleration, Color color)
    {
        super(name, maxSpeed, acceleration, color);
        setBoatType(BoatType.SKULLING);
        setTeam(Team.DOUBLE);
    }

    /**
     *default Constructor of the class, the constructor initialize the RowBoat
     */
    public RowBoat()
    {
        this("RowBoat#"+getSerial(),75,10,Color.RED);
    }


    /** Returns the Breed and RowBoat.  */
    @Override
    public String className()
    {
        return "RowBoat";
    }

    /** Returns the Breed and Type and Team.  */
    @Override
    public String describeSpecific()
    {
        return ", Type: "+getBoatType()+", Team: "+getTeam();
    }


    /**
     * Checking set team is a legal

     * @return <tt>true</tt> if the team is a legal else return false.
     */
    public void setTeam(Team team)
    {
        this.team=team;
    }
    /** Returns the team.  */

    public Team getTeam()
    {
        return this.team;
    }

    /**
     * Checking set type is a legal
     .
     * @return <tt>true</tt> if the type is a legal else return false.
     */
    public void setBoatType(BoatType type)
    {
        this.type=type;
    }

    /** Returns the type.  */
    public BoatType getBoatType()
    {
        return this.type;
    }



}