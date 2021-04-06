
/**
 * Class that creates planets and calculates their volume, radius,
 * and surface area
 *
 * @author Brenton Babb
 * @version 4/16/2020
 */
public class Planet extends Converter
{
    //instance vars
    private double volume;
    private double radius;
    private double surfaceArea;

    //earths surface area in sqaure miles
    static final double EARTHSURFACEAREA = 196900000;

    //Planet volumes in cubic km
    static final double JUPITERVOLUME = 1.43128 * Math.pow(10,15);
    static final double SATURNVOLUME = 8.2713 * Math.pow(10,14);
    static final double URANUSVOLUME =6.833 * Math.pow(10,13);
    static final double NEPTUNEVOLUME = 6.254 * Math.pow(10,13);
    static final double EARTHVOLUME = 1.08321 * Math.pow(10,12);
    static final double VENUSVOLUME = 9.2843 * Math.pow(10,11);
    static final double MARSVOLUME = 1.6318 * Math.pow(10,11);
    static final double MERCURYVOLUME = 6.083 * Math.pow(10,10);
    
    /**
     * @param volume volume of the planet
     */
    public Planet(double volume)
    {
        this.volume = volume;
        radius = Math.pow((volume * 3) / 4 * Math.PI, 1/3);
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * constructs a planet with no volume, radius, or surface area
     */
    public Planet()
    {
    }

    /**
     * @param addVolume added value of volume in cubic feet
     */
    public void addVolume(double addedVolume)
    {
        volume += cubicFeetToCubicMile(addedVolume);
        radius = Math.pow((volume * 3) / 4 * Math.PI, 1/3);
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
    }

    /**
     * @return volume of planet in cubic miles
     */
    public double getVolume()
    {
        return volume;
    }

    /**
     * @return radius of planet in miles
     */
    public double getRadius()
    {
        radius = Math.pow((volume / ((4.0/3.0) * Math.PI)), 1.0/3.0);
        return radius;
    }
    
    /**
     * @return surfacearea of planet in square miles
     */
    public double getSurfaceArea()
    {   
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        return surfaceArea;
    }
    
}
