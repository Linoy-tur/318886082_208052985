package game.racers;
import utilities.*;
import game.arenas.*;
import game.arenas.exception.RacerLimitException;
import game.arenas.exception.RacerTypeException;
import utilities.EnumContainer.*;
import utilities.Mishap;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
public abstract class Racer
{

    private static int Serial=1;
    private int serialNumber;
    private String name;
    private Point currentLocation;
    private Point finish;
    private Arena arena;
    private double maxSpeed;
    private double acceleration;
    private double currentSpeed;
    private double failureProbability;
    private Color color;
    private Mishap mishap;


    /**
     *Constructor of the class, the constructor initialize name and maxSpeed and acceleration and color of the race and setter

     */	public Racer(String name,double maxSpeed,double acceleration,Color color)
    {
        setSerialNumber(getSerial());
        this.setName(name);
        this.setColor(color);
        this.setMaxSpeed(maxSpeed);
        this.setAcceleration(acceleration);
        this.Serial++;

    }

    /**
     * Function build rules arena, start and finish
     * @param arena (Arena)
     * @param start (Point)
     * @param finish (Point)
     */
    public void initRace(Arena arena,Point start, Point finish)
    {
        this.setArena(arena);
        this.setCurrentLocation(start);
        this.setFinish(finish);
    }
    /**
     * function accelerate if not at top speed: currSpeed += acceleration*friction.
     *  move forward: currLocation.x += currSpeed (y is always 0 for now)
     *   has a chance for failure
     * @param friction (double)
     * @return <tt>new location</tt> if the location is a legal else return Reduction Factor.
     */
    public Point move(double friction)
    {
        if(this.mishap==null ||(mishap.getFixable() && mishap.getTurnsToFix()==0))
        {
            mishap=null;
            if(Fate.breakDown())
            {
                this.mishap=Fate.generateMishap();
                System.out.println(this.getName()+" Has a new mishap!: "+mishap);
                mishap.nextTurn();
                return move(friction,mishap.getReductionFactor());
            }
            else
                return move(friction,1);

        }

        else
        {
            if (mishap.getFixable())
            {
                mishap.nextTurn();
                return move(friction,mishap.getReductionFactor());
            }
            else return move(friction,mishap.getReductionFactor());
        }


    }
    /**
     *  function accelerate if not at top speed: currSpeed += acceleration*friction.
     *  move forward: currLocation.x += currSpeed (y is always 0 for now)
     *   has a chance for failure
     * @param friction (double)
     * @param m (double)
     * @return <tt>new location</tt> if the location is a legal
     */
    private Point move(double friction,double m)
    {
        if (this.currentSpeed < this.maxSpeed)
        {
            this.setCurrentSpeed(this.currentSpeed + this.acceleration * friction*m);
        }

        if (this.currentSpeed > this.maxSpeed)
        {
            this.setCurrentSpeed(this.maxSpeed);
        }

        Point newLocation = new Point((this.currentLocation.getX() + (1 * this.currentSpeed)),this.currentLocation.getY());
        this.setCurrentLocation(newLocation);
        return newLocation;
    }
    /**
     *  function to Returns from matches that represent the competitor, and contains all the basic details of a competitor
     * @return name + SerialNumber+ maxSpeed + acceleration + color
     */

    public String describeRacer()
    {
        return "name: "+ getName() +", SerialNumber: "+ getSerialNumber()+ ", maxSpeed: "+getMaxSpeed()+", acceleration: "+getAcceleration()+", color: "+getColor();
    }
    /**
     *  function to prints the competitor's type and details.
     * @return className + describeRacer + describeSpecific
     */
    public void introduce()
    {
        System.out.println("["+className()+"] "+describeRacer()+describeSpecific());
    }

    public abstract String className();
    public abstract String describeSpecific();

    /** Returns the name.  */
    public String getName()
    {
        return name;
    }
    /**
     * Checking set name is a legal

     * @return <tt>true</tt> if the name is a legal else return false.
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /** Returns the currentLocation.  */
    public Point getCurrentLocation()
    {
        return currentLocation;
    }
    /**
     * Checking set currentLocation is a legal
     * @return <tt>true</tt> if the currentLocation is a legal else return false.
     */
    public void setCurrentLocation(Point currentLocation)
    {
        this.currentLocation = new Point(currentLocation);
    }
    /** Returns the arena.  */
    public Arena getArena()
    {
        return arena;
    }
    /**
     * Checking set arena is a legal
     * @return <tt>true</tt> if the arena is a legal else return false.
     */
    public void setArena(Arena arena)
    {
        this.arena = arena;
    }
    /**
     * Checking set finish is a legal
     * @return <tt>true</tt> if the finish is a legal else return false.
     */
    public void setFinish(Point finish)
    {
        this.finish = new Point(finish);
    }
    /** Returns the maxSpeed.  */
    public double getMaxSpeed()
    {
        return maxSpeed;
    }
    /**
     * Checking set maxSpeed is a legal
     * @return <tt>true</tt> if the maxSpeed is a legal else return false.
     */
    public void setMaxSpeed(double maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
    /** Returns the acceleration.  */
    public double getAcceleration()
    {
        return acceleration;
    }
    /**
     * Checking set acceleration is a legal
     * @return <tt>true</tt> if the acceleration is a legal else return false.
     */
    public void setAcceleration(double acceleration)
    {
        this.acceleration = acceleration;
    }
    /** Returns the currentSpeed.  */
    public double getCurrentSpeed()
    {
        return currentSpeed;
    }
    /**
     * Checking set currentSpeed is a legal
     * @return <tt>true</tt> if the currentSpeed is a legal else return false.
     */
    public void setCurrentSpeed(double currentSpeed)
    {
        this.currentSpeed = currentSpeed;
    }
    /**
     * Checking set failureProbability is a legal
     * @return <tt>true</tt> if the failureProbability is a legal else return false.
     */
    public void setFailureProbability(double failureProbability)
    {
        this.failureProbability = failureProbability;
    }
    /** Returns the failureProbability.  */
    public double getFailureProbability()
    {
        return this.failureProbability;
    }
    /**
     * Checking set color is a legal
     * @return <tt>true</tt> if the color is a legal else return false.
     */
    public void setColor(Color color)
    {
        this.color = color;
    }
    /** Returns the color.  */
    public Color getColor()
    {
        return this.color;
    }
    /** Returns the Serial.  */
    public static int getSerial()
    {
        return Serial;
    }
    /**
     * Checking set serialNumber is a legal
     * @return <tt>true</tt> if the serialNumber is a legal else return false.
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber=serialNumber;
    }
    /** Returns the serialNumber.  */
    public int getSerialNumber() {
        return this.serialNumber; }



}