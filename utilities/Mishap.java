package utilities;
import java.text.DecimalFormat;

/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */

public class Mishap
{
    private boolean fixable;
    private double reductionFactor;
    private int turnsToFix;

    /**
     *Constructor of the class, the constructor initialize fixable and turnsToFix and reductionFactor of the Mishap
     * @param fixable (required).
     * @param turnsToFix (required).
     * @param reductionFactor (required).
     */
    public Mishap(boolean fixable, int turnsToFix, double reductionFactor)
    {
        this.setFixable(fixable);
        this.setReductionFactor(reductionFactor);
        this.setTurnsToFix(turnsToFix);

    }

    //////////////////////METHODS////////////////////////
    /**
     * reduces the turns to fix by 1
     */
    public void nextTurn()
    {
        if (getTurnsToFix()>0)
            setTurnsToFix(getTurnsToFix()-1);
    }

    public String toString() {
        return "("+getFixable()+","+getTurnsToFix()+","+new DecimalFormat("0.00").format(getReductionFactor())+")";
    }


    /**
     * Checking set Reduction Factor is a legal
     * @return <tt>true</tt> if the reductionFactor is a legal else return false.
     */
    public void setReductionFactor(double reductionFactor)
    {
        this.reductionFactor = reductionFactor;
    }

    /** Returns the reductionFactor .  */
    public double getReductionFactor()
    {
        return this.reductionFactor;
    }
    /**
     * Checking set Turns To Fix Factor is a legal
     * @return <tt>true</tt> if the turnsToFix is a legal else return false.
     */
    public void setTurnsToFix(int turnsToFix)
    {
        this.turnsToFix = turnsToFix;
    }
    /** Returns the turnsToFix .  */

    public int getTurnsToFix()
    {
        return this.turnsToFix;
    }
    /** Returns the fixable .  */

    public boolean getFixable()
    {
        return fixable;
    }
    /**
     * Checking set Fixable is a legal
     * @return <tt>true</tt> if the Fixable is a legal else return false.
     */
    public void setFixable(boolean fixable)
    {
        this.fixable = fixable;
    }



}