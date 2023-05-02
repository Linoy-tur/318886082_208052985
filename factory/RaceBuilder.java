package factory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import game.arenas.Arena;
import game.racers.Racer;
import utilities.EnumContainer.Color;

/**
 * This class defines the attributes Program
 * @author Hadar Cochavi 204719843
 * @author zohar azriaev 201454899 */
public class RaceBuilder
{
    private static RaceBuilder instance;

    /**
     * Constructor.
     * this Constructor builder Race.
     */
    public static RaceBuilder getInstance()
    {
        if(instance==null)
            instance=new RaceBuilder();
        return instance;
    }

    /**
     * build Arena
     * @param arenaType (required) brand arena.
     * @param length (required) brand arena.
     * @return <tt>true</tt> if the animal point x is a legal else return false.
     */
    public Arena buildArena(String arenaType,double length,int maxRacers) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        ClassLoader c=ClassLoader.getSystemClassLoader();
        Class<?> a;
        Constructor<?> b;
        a=c.loadClass(arenaType);
        b=a.getConstructor(double.class,int.class);
        return (Arena) b.newInstance(length,maxRacers);

    }
    /**
     * build Racer
     * @param racerType (required)
     * @param name (required)
     * @param maxSpeed (required)
     * @param color (required)
     * @throws ClassNotFoundException if aDiameter not in given range.
     * @throws NoSuchMethodException if No Such Method Exception.
     * @throws SecurityException if Security problem.
     * @throws InstantiationException if Instantiation.
     * @throws IllegalAccessException if Illegal Access
     * @throws IllegalArgumentException if Illegal Argument
     * @throws InvocationTargetException if Invocation Target
     * @return <tt>true</tt> Racer
     */
    public Racer buildRacer(String racerType,String name,double maxSpeed,double acceleration,utilities.EnumContainer.Color color) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        ClassLoader c=ClassLoader.getSystemClassLoader();
        Class<?> a;
        Constructor<?> b;
        a=c.loadClass(racerType);
        b=a.getConstructor(String.class,double.class,double.class,Color.class);
        return (Racer) b.newInstance(name,maxSpeed,acceleration,color);
    }
    /**
     * build Wheeled Racer
     * @param racerType (required)
     * @param name (required)
     * @param maxSpeed (required)
     * @param color (required)
     * @param wheels (required)
     * @throws ClassNotFoundException if aDiameter not in given range.
     * @throws NoSuchMethodException if No Such Method Exception.
     * @throws SecurityException if Security problem.
     * @throws InstantiationException if Instantiation.
     * @throws IllegalAccessException if Illegal Access
     * @throws IllegalArgumentException if Illegal Argument
     * @throws InvocationTargetException if Invocation Target
     * @return <tt>true</tt> Wheele dRacer
     */
    public Racer buildWheeledRacer(String racerType,String name,double maxSpeed,double acceleration,utilities.EnumContainer.Color color,int wheels) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        ClassLoader c=ClassLoader.getSystemClassLoader();
        Class<?> a;
        Constructor<?> b;
        a=c.loadClass(racerType);
        b=a.getConstructor(String.class,double.class,double.class,Color.class,int.class);
        return (Racer) b.newInstance(name,maxSpeed,acceleration,color,wheels);
    }
}