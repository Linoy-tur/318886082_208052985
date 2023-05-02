package game.arenas.exception;

/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */

public class RacerLimitException extends Exception
{

    /**
     *Constructor of the class, the constructor initialize maxRacers and serialNumber of the race.
     * @param serialNumber (required).
     * @param maxRacers (required).
     */
    public RacerLimitException(int maxRacers,int serialNumber)
    {
        super("Arena is full! (" + maxRacers +"active racers exist). racer #" + serialNumber +" was not added\r\n");
    }
}