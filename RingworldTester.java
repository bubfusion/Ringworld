
/**
 * Tester for the classes Planet, Converter, and Ringworld
 *
 * @author Brenton Babb
 * @version 4/17/2020
 */

public class RingworldTester extends Converter
{
    public static void main(String [] args)
    {
        //creation of Ringworld
        Ringworld ringworld = new Ringworld();
        
        //creation of planets
        Planet mercury = new Planet(Planet.MERCURYVOLUME);
        Planet venus = new Planet(Planet.VENUSVOLUME);
        Planet earth = new Planet(Planet.EARTHVOLUME);
        Planet mars = new Planet(Planet.MARSVOLUME);
        Planet jupiter = new Planet(Planet.JUPITERVOLUME);
        Planet saturn = new Planet(Planet.SATURNVOLUME);
        Planet uranus = new Planet(Planet.URANUSVOLUME);
        Planet neptune = new Planet(Planet.NEPTUNEVOLUME);
        
        //adding volumes of planets to Ringworld
        ringworld.addVolume(mercury);
        ringworld.addVolume(venus);
        ringworld.addVolume(earth);
        ringworld.addVolume(mars);
        ringworld.addVolume(jupiter);
        ringworld.addVolume(saturn);
        ringworld.addVolume(uranus);
        ringworld.addVolume(neptune);
        
        System.out.println("Ringworld class tester");
        System.out.println();
        System.out.println("The total volume of Ringworld is " +
        ringworld.getVolume() + " km^3");
        System.out.println();
        
        System.out.println("The total length of Ringworld is " +
        ringworld.getLength() + " km");
        System.out.println();
        
        System.out.println("The radius of Ringworld is " +
        ringworld.getRadius() + " AU");
        System.out.println();
        
        System.out.println("The total living area of Ringworld is " +
        ringworld.getArea() + " Earth units");
        System.out.println();
        System.out.println();
        
        System.out.println("Planet class tester");
        System.out.println();
        
        Planet myWorld = new Planet(10000);
        
        System.out.println("The volume of my world is " +
        myWorld.getVolume() + " mi^3");
        System.out.println();
        
        System.out.println("The radius of my world is " +
        myWorld.getRadius() + " mi");
        System.out.println();
        
        System.out.println("The surface area  of my world is " +
        myWorld.getSurfaceArea() + " mi^2");
        System.out.println();
        
        System.out.println("Adding 1000000000 square feet of planet to my world");
        myWorld.addVolume(1000000000);
        
        System.out.println();
        
        System.out.println("The new volume of my world is " +
        myWorld.getVolume() + " mi^3");
        System.out.println();
        
        System.out.println("The new radius of my world is " +
        myWorld.getRadius() + " mi");
        System.out.println();
        
        System.out.println("The new surface area  of my world is " +
        myWorld.getSurfaceArea() + " mi^2");
        System.out.println();
    }
}
