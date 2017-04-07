import java.util.ArrayList;
public class satellite2
{
  public static void main(String[]args)
  {
      ArrayList<Location> locate = new ArrayList<>();
      double[] honLoc = {5, 6};
      locate.add(new honda(honLoc));
      locate.add(new toyota("8, 9"));
      locate.add(new GMC(3, 8));
      double[] home = {0, 0};












      String printout = "\n\n" +


              "==========================" + "\nStarting locations...";

















      for (Location l : locate)


      {


          printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";


      }


	    System.out.println( "\n\n" + "==========================");


	   for (Location l : locate)


	   {


		   double x,y;


		   x = (Math.random()*100)+1;


		   y = (Math.random()*100)+1;


		   System.out.println(" after " + l.getID() + "moved +(" + x + ", " + y + ")");


		   l.move(x,y);


		   System.out.println("New Location: ("+ getLocation(l.getLoc())+")\n");


	   }












      printout += "\n\n" + "==========================" +


                  "\nDistance from home...";












      for (Location l : locate)


      {


          printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";


      }












      System.out.println(printout);


	  


	


  }












  public static double getDistance(double[] car, double[] home)


  {


      return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));


  }












  public static String getLocation(double[] loc)


  {


      return loc[0]+ ", " + loc[1];


  }


}

