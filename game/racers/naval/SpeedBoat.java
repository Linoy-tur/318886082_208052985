package game.racers.naval;

import game.racers.Racer;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.Team;
import utilities.EnumContainer.BoatType;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
public class SpeedBoat extends Racer {

    //@SuppressWarnings("unused")
    private BoatType type;
    //	@SuppressWarnings("unused")
    private Team team;

    /**
     *Constructor of the class, the constructor initialize name and maxSpeed and acceleration and color of the SpeedBoat
     * @param name (required).
     * @param maxSpeed (required).
     * @param acceleration (required).
     * @param color (required).
     */
    public SpeedBoat(String name, double maxSpeed, double acceleration, Color color)
    {
        super(name, maxSpeed, acceleration, color);
        setBoatType(BoatType.SKULLING);
        setTeam(Team.DOUBLE);
    }
    /**
     *default Constructor of the class, the constructor initialize the SpeedBoat
     */
    public SpeedBoat()
    {
        this("SpeedBoat#"+getSerial(),170,5,Color.RED);
    }

    /** Returns the SpeedBoat.  */

    @Override
    public String className()
    {
        return "SpeedBoat";
    }
    /** Returns the Type and Team .  */

    @Override
    public String describeSpecific()
    {
        return ", Type: "+getBoatType()+" ,Team: "+getTeam();
    }

    /**
     * Checking set type is a legal

     * @return <tt>true</tt> if the type is a legal else return false.
     */
    public void setBoatType(BoatType type)
    {
        this.type = type;
    }
    /** Returns the type .  */

    public BoatType getBoatType()
    {
        return type;
    }

    /**
     * Checking set team is a legal

     * @return <tt>true</tt> if the team is a legal else return false.
     */
    public void setTeam(Team team)
    {
        this.team = team;
    }
    /** Returns the team .  */

    public Team getTeam()
    {
        return team;
    }

}