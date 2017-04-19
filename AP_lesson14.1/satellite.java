import java.util.ArrayList;
import java.util.Arrays;
public class satellite
{
  public static void main(String[]args)
  {
      ArrayList<car> locate = new ArrayList<>();


      double[] honLoc = {5, 6};


      locate.add(new honda(honLoc));


      locate.add(new toyota("8, 9"));


      locate.add(new gmc(3, 8));


       double[] home = {0, 0};


       String printout = "\n\n" +


              "==========================";


       for (car l : locate)

       {
          
       }
		for(car object : locate)


			{


				double x = (Math.random()*100)+1;


				double y = (Math.random()*100)+1;


				object.move(x,y);


				printout += "\n==========================\nAfter " +"%$.2f" object.getID() + " Moved(" + x + ", " + y + ")\nNew Location: " + Arrays.toString(object.getLoc());


			}
      
		
		{
		
			{
				printout += "\n\n" + "==========================" + "\n" + "==========================" +


                  "\nDistance from home...";

				for (car l : locate)

				{
					printout += "\nDistance for " + l.getID() + ": (" + %$.2f "getDistance(l.getLoc(), home)+ ")";

				}
				   System.out.println(printout);
			
			}

		}	
       

		


  }


   public static double getDistance(double[] car, double[] home)


  {


      return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
	

  }







   public static String getLocation(double[] loc)


  {


      return loc[0] + ", " + loc[1];


  }


}

