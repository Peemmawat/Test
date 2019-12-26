package tiangpolkrang.peemmawat.lab2;

/**
* This Athlete program is to accept three arguments include athlete name, the sport name 
* that athlete plays, and the nationality of that athlete.  Its output format is "My favorite athlete is  
* <athlete_name> who plays <sport_name> and has nationality as <athlete_nationality>"
* Author: Peemmawat Tiangpolkrang
* ID: 563040565-0
* Sec: 1
* Date: December 25, 2019
*
**/


public class Athlete{
   public static void main(String[] args) {
	if(args.length == 3){
      String athlete_name = args[0];
      String sport_name = args[1];
      String athlete_nationality = args[2];
         System.out.println("My favorite athlete is " + athlete_name + " who plays " + sport_name + " and has nationality as " + athlete_nationality + ".");}
	else{
	 System.out.println("Athlete <athlete_name> <sport_name> <athlete_nationality>");
	}
   }
}