package game.arenas.exception;
/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */
public class RacerTypeException extends Exception
{

    /**
     *Constructor of the class, the constructor initialize className and arenaName of the race Type Exception
     * @param className (required).
     * @param arenaName (required).
     */
    public RacerTypeException(String className,String arenaName)
    {
        super("Invalid Racer of type "+className +" for "+arenaName );

    }
}