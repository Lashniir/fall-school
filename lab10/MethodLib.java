
/**
 * Write a description of class MethodLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MethodLib
{
    public static double avgAccel(double v0, double v1, double t)
    {
        double a = (v1-v0)/t;
        return a;
    }
}