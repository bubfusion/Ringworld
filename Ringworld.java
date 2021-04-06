
/**
 * The Ringworld class. Takes in planets and calculates volume, length,
 * area, and radius of the Ringworld
 *
 * @author Brenton Babb
 * @version 4/17/2020
 */
public class Ringworld extends Converter
{
    //constants (Bonus these are bad because 1: You cant change them if 
    // you wanted to else where 2: the units are switching between
    //metric and imperial systems)
    
    static final double miAcross = 900000;
    static final double mThick = 100;
    static final double miWallHeight = 1000;
    static final double mWallThick = 100;
    
    //instance vars
    private double totalVolume;
    private double length;
    private double area;
    private double radius;
    
    /**
     * @param volume volume of planet/s being added to Ringworld
     */
    public Ringworld(double volume)
    {
        totalVolume = volume;

        length = (totalVolume / (miToKm(miAcross) * mToKm(mThick)) 
            + (miToKm(miWallHeight) * mToKm(mWallThick))/3);

        radius = kmToAu(length / (2 * Math.PI));

        area = miToEarthUnit(kmToMi(length) * miAcross);
    }

    public Ringworld()
    {
    }
    
    /**
     * @param planet planet that is being added to the total volume
     */
    public void addVolume(Planet planet)
    {
        totalVolume += planet.getVolume();

        length = (totalVolume / (miToKm(miAcross) * mToKm(mThick)) 
            + (miToKm(miWallHeight) * mToKm(mWallThick))/3);

        radius = kmToAu(length / (2 * Math.PI));

        area = miToEarthUnit(kmToMi(length) * miAcross);
    }
    
    /**
     * @return total volume of Ringworld in cubic km 
     */
    public double getVolume()
    {
        return totalVolume;
    }

    /**
     * @return length of Ringworld in km
     */
    public double getLength()
    {
        return length; 
    }

    /**
     * @return area of Ringworld in earth units
     */
    public double getArea()
    {
        return area;
    }

    /**
     * @return length of radius in AU
     */
    public double getRadius()
    {
        return radius;
    }

    // /**
    // * makes sure that the length is correct
    // */
    // public double test()
    // {
    // return (miToKm(miAcross) * mToKm(mThick) * length) + 
    // (miToKm(miWallHeight) * mToKm(mWallThick) * length) +
    // (miToKm(miWallHeight) * mToKm(mWallThick) * length);
    // }
}
