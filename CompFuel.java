
	// class Compfuel{
	 // public static void main(String[] args){
		 // Vehicle minivan = new Vehicle();
		 // Vehicle sportscar = new Vehicle();
		 //int range1, range2;
		 // double gallons;
		 // int dist =253;
		 
		 // minivan.passengers = 7;
		 // minivan.fuelCap = 16;
		 // minivan.mpg = 21;
		 
		 // sportscar.passengers = 2;		 
		 // sportscar.fuelCap = 14;
		 // sportscar.mpg = 12;
		 
		 // gallons = minivan.fuelNeeded(dist);
		 
		 // System.out.println(dist + "/" + gallons);
		 
		 // gallons = sportscar.fuelNeeded(dist);
		 
		 // System.out.println(dist + "/" + gallons);
	 // }
 // }
 
 	class Compfuel{
	 public static void main(String[] args){
		 Vehicle minivan = new Vehicle(7, 16, 21);
		 Vehicle sportscar = new Vehicle(2, 14, 12);
		 //int range1, range2;
		 double gallons;
		 int dist =254;
		 
		 // minivan.passengers = 7;
		 // minivan.fuelCap = 16;
		 // minivan.mpg = 21;
		 
		 // sportscar.passengers = 2;		 
		 // sportscar.fuelCap = 14;
		 // sportscar.mpg = 12;
		 
		 gallons = minivan.fuelNeeded(dist);
		 
		 System.out.println(dist + "/" + gallons);
		 
		 gallons = sportscar.fuelNeeded(dist);
		 
		 System.out.println(dist + "/" + gallons);
	 }
 }
		

 class Vehicle{
	 int passengers;
	 int fuelCap;
	 int mpg;
	 int range(){
		 return fuelCap * mpg;
	 }
	 
	 double fuelNeeded(int miles){
		 return (double) miles / mpg;
	}
	Vehicle(int p, int f, int m)
	{
		passengers = p;
		fuelCap = f;
		mpg = m;
	}
	
  } 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 