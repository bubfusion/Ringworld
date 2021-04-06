
/**
 * Methods for conversions required for Ringworld
 *
 * @author Brenton Babb
 * @version 4/17/2020
 */
public class Converter
{
   /**
    * @param km km that are being converted
    */
   public double kmToMi(double km)
   {
       return km / 1.609;
   }
   
   /**
    * @param mi mi that are being converted
    */
   public double miToKm(double mi)
   {
       return mi * 1.609;
   }
   
   /**
    * @param km cubic km that are being conveted to mi
    */
   public double cubicKmToCubicMi(double km)
   {
       return km / 4.168;
   }
   
   /**
    * @param mi cubic mi being conceverted to cubic km
    */
   public double cubicMiToCubicKm(double mi)
   {
        return mi * 4.168;
   }
   
   /**
    * @param m m being converted to km
    */
   public double mToKm(double m)
   {
       return m / 1000;
   }
   
   /**
    * @param km km to converted to AU
    */
   public double kmToAu(double km)
   {
       return km / (1.496 * Math.pow(10,8));
   }
   
   /**
    * @param ft cubic ft being converted to cubic miles
    */
   public double cubicFeetToCubicMile(double ft)
   {
       return ft / (1.472 * Math.pow(10, 11));
   }
   
   /**
    * @param mi square mi being converted to earth units
    */
   public double miToEarthUnit(double mi)
   {
       return mi / Planet.EARTHSURFACEAREA;
   }
}
